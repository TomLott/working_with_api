package com.example.testingApi.requests;

import lombok.Data;

import java.util.List;

@Data
public class TickerRequest {
    private Pagination pagination;
    private List<TickerData> data;
}
