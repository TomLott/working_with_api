package com.example.testingApi.controller;

import com.example.testingApi.requests.eod.EODRequest;
import com.example.testingApi.requests.intraday.IntradayRequest;
import com.example.testingApi.requests.TickerData;
import com.example.testingApi.requests.TickerRequest;
import com.example.testingApi.service.SimpleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping()
public class SimpleController {

    private final SimpleService simpleService;

    public SimpleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @GetMapping("/tickers")
    public TickerRequest allTickers(){
        return simpleService.getAllTickers();
    }

    @GetMapping("/eod/{symbol}")
    public EODRequest getBySymbol(@PathVariable("symbol") String symbol){
        return simpleService.getSimpleEODbySymbol(symbol);
    }

    @GetMapping("/tickers-name")
    public Map<String, String> getAllTickersName(){
        TickerRequest tickerRequest = allTickers();
        Map<String, String> map = tickerRequest.getData()
                .stream()
                .distinct()
                .collect(Collectors.toMap(TickerData::getSymbol, TickerData::getName));
        return map;
    }

    @GetMapping("/intraday/{symbol}")
    public ResponseEntity<IntradayRequest> getIntradayForTicker(@PathVariable("symbol") String symbol){
        Optional<IntradayRequest> response = simpleService.getIntradayForTicker(symbol);
        if (response.isPresent()) {
            return new ResponseEntity<IntradayRequest>(response.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
