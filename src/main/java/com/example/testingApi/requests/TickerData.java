package com.example.testingApi.requests;

import com.example.testingApi.utils.enums.Country;
import lombok.Data;

@Data
public class TickerData {
    private String name;
    private String symbol;
    private boolean hasIntraday;
    private boolean hasEod;
    private Country country;
    private StockExchangeRequest stock_exchange;
}
