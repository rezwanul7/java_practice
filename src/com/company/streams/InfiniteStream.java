package com.company.streams;

import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        Stream<Double> infiniteStream = Stream.generate(Math::random);
        infiniteStream
                .limit(10)
                .mapToInt(aDouble -> Double.valueOf(aDouble* 100).intValue())
                .forEach(System.out::println);

        //another way
        Stream<Integer> integerStream = Stream.iterate(1, integer -> integer + 3);
        integerStream.limit(10).forEach(System.out::println);
    }
}
