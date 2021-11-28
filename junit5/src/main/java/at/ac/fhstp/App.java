package at.ac.fhstp;

public class App {
    public static void main(String[] args) {

        CryptoReader_CoinMarket cm = new CryptoReader_CoinMarket();
        System.out.print(cm.request());

    }
}
