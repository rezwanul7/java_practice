package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(new Movie[]{
                new Movie("a", 10)
        });

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        movies.stream()
                .map(movie -> movie.getLikes())
                .forEach(like -> System.out.println(" likes : " + like));




//        System.out.println("Hello");
//        int[] numbers = {1,2,3,4,5};
//        OptionalDouble count = Arrays.stream(numbers).average();
//        System.out.println(count);
//
//        Arrays.stream(numbers).forEach(new IntConsumer() {
//            @Override
//            public void accept(int value) {
//                System.out.println("val : " + value);
//            }
//        });
//
//        Stream<Double> doubleStream = Stream.generate(new Supplier<Double>() {
//            @Override
//            public Double get() {
//                return Math.random()*100;
//            }
//        });
//
//        doubleStream.limit(5).forEach(aDouble -> System.out.println("random " + aDouble));
//
    }
}