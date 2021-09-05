package com.example.testingApi.requests;

import com.example.testingApi.TestData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
class StockExchangeRequestTest {

    @Test
    public void testRequest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String path = "src/test/resources/input/stockExchange.json";
        InputStream inputStream = TestData.getData(path);
        StockExchangeRequest stockExchangeRequest = objectMapper.readValue(inputStream, StockExchangeRequest.class);
        System.out.println(stockExchangeRequest.getName());
    }



}