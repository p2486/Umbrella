package at.ac.fhstp;

import java.util.Iterator;
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

import org.json.JSONArray;
import org.json.JSONObject;

public class Interpreter_CoinMarket implements Interpreter {

    @Override
    public List<Coin> Interprete(String HTTPResponse) {

        JSONObject json = new JSONObject(HTTPResponse);
        Map<String, Object> JsonMap = json.toMap();
        JSONArray jarry = (JSONArray)json.get("data");


        System.out.println(jarry.getJSONObject(0).optString("id"));
        System.out.println(jarry.getJSONObject(0).optString("symbol"));
        System.out.println(jarry.getJSONObject(0).optString("cmc_rank"));
        System.out.println(jarry.getJSONObject(0).getJSONObject("quote").optString("USD"));
        
        
        // TODO Auto-generated method stub
        return null;
    }

}
