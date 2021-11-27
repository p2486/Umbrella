package at.ac.fhstp.zoechbauer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

public class HTTP {

    /**
     * @param args
     */
    public static void test(String[] args) {
        try {
            HttpRequest req = HttpRequest
                    .newBuilder()
                    .uri(new URI("https://orf.at/#/stories/3238020/"))
                    .GET()
                    .build();

            HttpResponse<String> res = HttpClient
                    .newBuilder()
                    .build()
                    .send(req, HttpResponse.BodyHandlers.ofString());

            System.out.println(res);
        } catch (URISyntaxException | IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}