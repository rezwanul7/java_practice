package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromListTest {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 12),
                new Movie("b", 15),
                new Movie("c", 16),
                new Movie("d", 18)
        );

        List<Movie> modifiedMovieCollection = movies.stream()
                .map(
                        movie -> {
                            return new Movie(movie.getTitle() + " x", movie.getLikes());
                        }
                )
                .collect(Collectors.toList());

        System.out.println(modifiedMovieCollection);

        System.out.println("------");
        movies.stream()
                .forEach(movie -> System.out.println(movie));

    }
}