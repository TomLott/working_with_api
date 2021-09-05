package com.example.testingApi.api;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ExternalAPI {

    private String apiKey = "ce6fdb80d068d9d1019cc6397378aaec";

    private String url = "http://api.marketstack.com/v1/";

    public String getSpecifiedUrl(String endpoint, String symbol){
        if (symbol == null)
            return url + endpoint + "?access_key=" + apiKey;
        return url + endpoint + "?access_key=" + apiKey + "&symbols=" + symbol;
    }

}
