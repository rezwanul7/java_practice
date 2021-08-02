package com.rezwanul7.enums;

import java.util.Arrays;

public enum TableStatus {
    RESERVED("blue", "http://abc"),
    //    READY("blue"),
//    PROCESSING("a"),
//    OCCUPIED("a"),
//    SERVING("s"),
    BILL_PAID("green", "http://xyz"),
    UNKNOWN("red", "http://unknown");

    private String label;
    private String color;

    TableStatus(String label, String color) {
        this.label = label;
        this.color = color;
    }

    public String getLabel() {
        return this.label;
    }

    public String getColor() {
        return this.color;
    }

    public static TableStatus getEnum(String value) {
        return Arrays.stream(TableStatus.values())
                .filter(tableStatus -> tableStatus.name().equalsIgnoreCase(value))
                .findFirst()
                .orElse(UNKNOWN);
    }
}