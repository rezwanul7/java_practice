package com.company.streams;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        Stream<List<Integer>> listStream = Stream.of(List.of(1, 3, 5), List.of(2, 4, 6));

        Stream<Integer> flattenStream = listStream.flatMap(integerList -> integerList.stream());

        flattenStream.sorted().forEach(integer -> System.out.println(integer));

    }
}
