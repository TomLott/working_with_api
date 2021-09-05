package com.example.testingApi.requests.eod;

import lombok.Data;

import java.util.Date;

@Data
public class EODData {
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double volume;
    private Double adjHigh;
    private Double adjLow;
    private Double adjVolume;
    private Long splitFactor;
    private String symbol;
    private String exchange;
    private Date date;
}
