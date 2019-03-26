package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();

        String listOfFilms = movies.values().stream()
                .flatMap(titles -> titles.stream())
                .collect(Collectors.joining("!", "", ""));

        System.out.println(listOfFilms);
    }
}
