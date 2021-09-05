package com.example.testingApi;

import org.springframework.util.ResourceUtils;

import java.io.*;


public class TestData {

    public static InputStream getData(String path) throws FileNotFoundException {
        File file = ResourceUtils.getFile(path);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        }catch (Exception e){
            System.err.println("Cannot read test file");
        }
        return inputStream;
    }
}
