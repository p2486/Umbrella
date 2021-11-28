package at.ac.fhstp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsNot;
import org.hamcrest.text.IsEmptyString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldAnswerWithFalse() {
        assertFalse(false);
    }

    @Test
    public void readJSONshouldreturnText(){
        CryptoReader cr=new CryptoReader_CoinMarket();
        assertThat(cr.read(),not(emptyString()));
    }
    @Test
    public void generateCoin(){
        String httpResult="{\n    \"data\": [\n        {\n            \"id\": 1,\n            \"name\": \"Bitcoin\",\n            \"symbol\": \"BTC\",\n            \"slug\": \"bitcoin\",\n            \"cmc_rank\": 5,\n            \"num_market_pairs\": 500,\n            \"circulating_supply\": 16950100,\n            \"total_supply\": 16950100,\n            \"max_supply\": 21000000,\n            \"last_updated\": \"2018-06-02T22:51:28.209Z\",\n            \"date_added\": \"2013-04-28T00:00:00.000Z\",\n            \"tags\": [\n                \"mineable\"\n            ],\n            \"platform\": null,\n            \"quote\": {\n                \"USD\": {\n                    \"price\": 9283.92,\n                    \"volume_24h\": 7155680000,\n                    \"volume_change_24h\": -0.152774,\n                    \"percent_change_1h\": -0.152774,\n                    \"percent_change_24h\": 0.518894,\n                    \"percent_change_7d\": 0.986573,\n                    \"market_cap\": 852164659250.2758,\n                    \"market_cap_dominance\": 51,\n                    \"fully_diluted_market_cap\": 952835089431.14,\n                    \"last_updated\": \"2018-08-09T22:53:32.000Z\"\n                },\n                \"BTC\": {\n                    \"price\": 1,\n                    \"volume_24h\": 772012,\n                    \"volume_change_24h\": 0,\n                    \"percent_change_1h\": 0,\n                    \"percent_change_24h\": 0,\n                    \"percent_change_7d\": 0,\n                    \"market_cap\": 17024600,\n                    \"market_cap_dominance\": 12,\n                    \"fully_diluted_market_cap\": 952835089431.14,\n                    \"last_updated\": \"2018-08-09T22:53:32.000Z\"\n                }\n            }\n        }]}";
        
        Interpreter ip= new Interpreter_CoinMarket();
        List<Coin> coinlist = new ArrayList<>();

        ip.Interprete(httpResult,coinlist);

        for (Coin coin : coinlist) {
            assertThat(coin.getId(),is(Integer.valueOf(1)));
            assertEquals(coin.getName(),"Bitcoin");
            assertEquals(coin.getSymbol(),"BTC");
            assertThat(coin.getPrice(),is(Double.valueOf(9283.92)));
        }
    }
}
