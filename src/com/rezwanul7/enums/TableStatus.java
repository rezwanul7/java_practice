package com.rezwanul7.enums;

import java.util.Arrays;

public enum TableStatus {
    RESERVED("reserved", "blue"),
    READY("ready","yellow"),
    BILL_PAID("paid", "green"),
    UNKNOWN("not found", "red");

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