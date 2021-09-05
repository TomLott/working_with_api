package com.example.testingApi.requests;

import lombok.Data;

@Data
public class Pagination{
    private Long limit;
    private Long offset;
    private Long count;
    private Long total;
}
