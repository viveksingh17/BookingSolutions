package com.example.bookingsolutions.bookmyshowlld.service;

import com.example.bookingsolutions.bookmyshowlld.modules.Movie;
import com.example.bookingsolutions.bookmyshowlld.modules.Theater;

import java.util.List;
import java.util.Map;

public interface MovieService {
    void addMovies(Movie movie);

    List<Movie> getAllMovie();

    void addTheater(Theater theater);

    List<Theater> getAllTheater();

    Map<Integer, List<Movie>> getTheaterWiseMovie(List<Integer> theaterIds);
}
