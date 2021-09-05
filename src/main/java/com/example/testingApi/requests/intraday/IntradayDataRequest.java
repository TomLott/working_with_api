package com.example.testingApi.requests.intraday;

import lombok.Data;

import java.util.Date;

@Data
public class IntradayDataRequest {
    private Double open;
    private Double high;
    private Double low;
    private Double last;
    private Double close;
    private Double volume;
    private Date date;
    private String symbol;
    private String exchange;
}
