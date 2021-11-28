package at.ac.fhstp;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //System.out.print("Start");
       
        CoinManager manager = new CoinManager();
        manager.read(new CryptoReader_CoinMarket(),new Interpreter_CoinMarket())
        .sortPrice()
        .print()
        .sortTopMover()
        .print();
        // absteigend sortieren siehe compareTo Methode in Coin
        // manager.sortPrice();
        //alle ausgeben
        //manager.print();        
        // Top Mover
        //manager.sortTopMover();
        //ausgeben
        //manager.print();
 
        // List<Coin> coins =
        // for (Coin coin : coins) {
        // System.out.print(coin.toString() + "\n");

        /*
        Read -> Interprete -> sort -> print -> resort -> print

        */
        // }

    }
}
