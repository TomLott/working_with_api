package com.example.testingApi.requests.intraday;

import com.example.testingApi.requests.Pagination;
import lombok.Data;

import java.util.List;

@Data
public class IntradayRequest {
    private Pagination pagination;
    private List<IntradayDataRequest> data;
}
