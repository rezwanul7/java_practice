package com.company.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        Stream<Movie> movieStream = Stream.of(
                new Movie("a", 9),
                new Movie("b", 10),
                new Movie("c", 11),
                new Movie("d", 15),
                new Movie("Elon Mask", 16),
                new Movie("Moon Seen", 18)
        );


        Predicate<Movie> popularMovies = movie -> movie.getLikes() > 12;
        Predicate<Movie> bigTitleMovies = movie -> movie.getTitle().length() > 5;

        Predicate<Movie> popularBigTitleMovies = popularMovies.and(bigTitleMovies);

        movieStream
                .filter(popularBigTitleMovies)
                .forEach(System.out::println);

    }
}
