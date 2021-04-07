package com.company.streams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {
    public static void main(String[] args) {
        Stream<Double> infiniteStream = Stream.generate(Math::random);

        List<Integer> integerList = infiniteStream
                .limit(10)
                .map(aDouble -> Double.valueOf(aDouble * 100).intValue())
                .collect(Collectors.toList());

        System.out.println(integerList);
        System.out.println(infiniteStream.collect(Collectors.toList()));

    }
}
