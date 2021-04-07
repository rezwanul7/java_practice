package com.rezwanul7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GenericNumberCollection<Integer> numberCollection = new GenericNumberCollection<>(Arrays.asList(1,3,2,4,3,4,5));


        System.out.println(numberCollection.count(number -> number % 2 == 0));

        System.out.println(Algorithm.max(4,4));
        System.out.println(Algorithm.findMax(0,4, Arrays.asList(8,7,1,9,3)));
    }
}
