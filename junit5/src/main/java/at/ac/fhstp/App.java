package at.ac.fhstp;

public class App {
    public static void main(String[] args) {

        CoinMarket cm = new CoinMarket();
        System.out.print(cm.request());

    }
}
