package at.ac.fhstp;

import java.util.List;
import java.util.Map;

import javax.naming.spi.ObjectFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONObject;

public class Interpreter_CoinMarket implements Interpreter {

    @Override
    public List<Coin> Interprete(String HTTPResponse) {

        JSONObject json = new JSONObject(HTTPResponse);
        Map<String, Object> JsonMap = json.toMap();

        for (Map.Entry<String, Object> entry : JsonMap.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue().toString() + "\n");

        }

        // TODO Auto-generated method stub
        return null;
    }

}
