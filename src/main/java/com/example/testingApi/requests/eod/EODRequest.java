package com.example.testingApi.requests.eod;


import com.example.testingApi.requests.Pagination;
import lombok.Data;

import java.util.List;

@Data
public class EODRequest {
    private Pagination pagination;
    private List<EODData> data;
}
