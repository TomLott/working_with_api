package com.example.testingApi.service;

import com.example.testingApi.api.ExternalAPI;
import com.example.testingApi.requests.eod.EODRequest;
import com.example.testingApi.requests.intraday.IntradayRequest;
import com.example.testingApi.requests.TickerRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class SimpleService {

    private final ExternalAPI externalAPI;
    private final RestTemplate restTemplate;

    public SimpleService(ExternalAPI externalAPI, RestTemplate restTemplate) {
        this.externalAPI = externalAPI;
        this.restTemplate = restTemplate;
    }

    public EODRequest getSimpleEODbySymbol(String symbol){
        return restTemplate.getForObject(externalAPI.getSpecifiedUrl("eod", symbol), EODRequest.class);
    }

    public TickerRequest getAllTickers() {
        RestTemplate restTemplate1 = new RestTemplate();
        Map<String, String> uriVars = new HashMap<>();
        uriVars.put("apiKey", externalAPI.getApiKey());
        uriVars.put("endPoint", "tickers");
        URI uri = UriComponentsBuilder.fromHttpUrl(externalAPI.getUrl()+"/{endPoint}?access_key={apiKey}").build(uriVars);
        return restTemplate1.getForObject(uri, TickerRequest.class);
    }

    public Optional<IntradayRequest> getIntradayForTicker(String symbol) {
        return Optional.of(restTemplate.getForObject(externalAPI.getSpecifiedUrl("intraday",symbol), IntradayRequest.class));
    }
}
