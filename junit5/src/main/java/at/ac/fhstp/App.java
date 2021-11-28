package at.ac.fhstp;

import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.print("Hello World!");
        CryptoReader_CoinMarket cm = new CryptoReader_CoinMarket();
        Interpreter_CoinMarket i = new Interpreter_CoinMarket();
        i.Interprete(cm.read());

        // List<Coin> coins =
        // for (Coin coin : coins) {
        // System.out.print(coin.toString() + "\n");

        // }

    }
}
