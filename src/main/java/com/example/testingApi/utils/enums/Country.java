package com.example.testingApi.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Country {
    USA("USA"),
    RUSSIA("RUSSIA");

    private final String value;
}
