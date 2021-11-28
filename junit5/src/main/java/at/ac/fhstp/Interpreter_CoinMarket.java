package at.ac.fhstp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public List<Coin> Interprete(String HTTPResponse,List<Coin> coinlist) {

        JSONObject json = new JSONObject(HTTPResponse);
        JSONArray jarry = (JSONArray)json.get("data");

        //alle in Liste hinzufügen
        for (Object job : jarry) {
        String id=(((JSONObject)job).optString("id"));
        String name=(((JSONObject)job).optString("name"));
        String symbol=(((JSONObject)job).optString("symbol"));
        String cmc_rank=(((JSONObject)job).optString("cmc_rank"));
        String price=(((JSONObject)job).getJSONObject("quote").getJSONObject("USD").optString("price"));
        String volume_24h=(((JSONObject)job).getJSONObject("quote").getJSONObject("USD").optString("volume_24h"));
        String percent_change_24h=(((JSONObject)job).getJSONObject("quote").getJSONObject("USD").optString("percent_change_24h"));
        String last_updated=(((JSONObject)job).getJSONObject("quote").getJSONObject("USD").optString("last_updated"));
        Coin c= new Coin(Integer.parseInt(id),name,symbol,Integer.parseInt(cmc_rank),Double.parseDouble(price),Double.parseDouble(volume_24h),Double.parseDouble(percent_change_24h),last_updated);
        coinlist.add(c);
        
        }
        
        return coinlist;
        
       
        
    }

}
