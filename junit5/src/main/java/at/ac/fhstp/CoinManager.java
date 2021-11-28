package at.ac.fhstp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CoinManager {
    private List<Coin> coinlist = new ArrayList<>();

    public CoinManager read(CryptoReader cr,Interpreter ip){
        
        ip.Interprete(cr.read(),this.coinlist);
        return this;
    }

    public CoinManager sortPrice() {
        System.out.println("\n Sortiert nach Kurs \n");
        Collections.sort(coinlist);
        return this;
    }

    public CoinManager print() {
        Iterator<Coin> ic = coinlist.iterator();
       
        while(ic.hasNext()){
            Coin c = ic.next();
            System.out.println(c.getSymbol()+" | "+c.getPrice()+" | "+c.getPercent_change_24h());
        }
        return this;
    }

    public CoinManager sortTopMover() {
        System.out.println("\n Sortiert nach Top Movern \n");
        coinlist.sort((Coin c1,Coin c2)->Double.compare(c2.getPercent_change_24h(),(c1.getPercent_change_24h())));
        return this;
    }
    

}
