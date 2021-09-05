package com.example.testingApi.requests;

import lombok.Data;

@Data
public class StockExchangeRequest {
    private String name;
    private String acronym;
    private String mic;
    private String country;
    private String country_code;
    private String city;
    private String website;
}
