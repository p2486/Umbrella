package at.ac.fhstp;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

public class CryptoReader_CoinMarket implements CryptoReader {

    private String APIKey = "380ca9de-b801-4a31-8fd7-c2b5b6051c29";

    public void SetAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    @Override
    public String read() {

        // curl -H "X-CMC_PRO_API_KEY: b54bcf4d-1bca-4e8e-9a24-22ff2c3d462c" -H "Accept:
        // application/json" -d "start=1&limit=5000&convert=USD" -G
        // https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest

        try {

            HttpRequest req = HttpRequest

                    .newBuilder()
                    .uri(new URI("https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest"))
                    .setHeader("X-CMC_PRO_API_KEY", APIKey) // add
                    .setHeader("Accept", "application/json") // add
                    // request
                    // header

                    .GET()
                    .build();

            HttpResponse<String> res = HttpClient
                    .newBuilder()
                    .build()
                    .send(req, HttpResponse.BodyHandlers.ofString());

            // Hier wäre es schöner wenn gleich ein Stream retour kommt.
            // Siehe
            // https://www.programcreek.com/java-api-examples/?api=java.net.http.HttpResponse
            // -> Beispiel 15

           // System.out.print("HTTP Status: " + res.toString());
            return res.body().toString();
        } catch (URISyntaxException | IOException | InterruptedException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
            return null;
        }

    }

}