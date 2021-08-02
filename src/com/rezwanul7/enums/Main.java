package com.rezwanul7.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(TableStatus.RESERVED.getLabel());
        System.out.println(TableStatus.RESERVED.getColor());

        //reverse lookup
        String status = "BILL";
        TableStatus tableStatus = TableStatus.getEnum(status);
        System.out.println(tableStatus.getLabel());
    }
}
