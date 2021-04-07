package com.company.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream<Movie> movieStream = Stream.of(
                new Movie("a", 12),
                new Movie("b", 15),
                new Movie("c", 16),
                new Movie("d", 18)
        );
        movieStream.forEach(movie -> {
            System.out.println("Title : " + movie.getTitle());
        });
    }
}
