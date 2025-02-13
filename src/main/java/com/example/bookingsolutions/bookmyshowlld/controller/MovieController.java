package com.example.bookingsolutions.bookmyshowlld.controller;

import com.example.bookingsolutions.bookmyshowlld.modules.Movie;
import com.example.bookingsolutions.bookmyshowlld.modules.Theater;
import com.example.bookingsolutions.bookmyshowlld.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Controller("/v1/movie")
public class MovieController {

    static List<Theater> theaterList;

    @Autowired
    MovieService movieService;

    // movie Name , Type
    @PostMapping("/addMovie")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        movieService.addMovies(movie);
        return  new ResponseEntity<>(new Movie(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAllMovie")
    public ResponseEntity<List<Movie>> getAllMovie(){
        List<Movie> movieList = movieService.getAllMovie();
        return  new ResponseEntity<>(movieList, HttpStatus.OK);
    }

    @PostMapping("/addTheater")
    public ResponseEntity<Theater> addTheater(@RequestBody Theater theater){
        movieService.addTheater(theater);
        return  new ResponseEntity<>(new Theater(), HttpStatus.ACCEPTED);
    }


    @GetMapping("/getAllTheater")
    public ResponseEntity<List<Theater>> getAllTheater(){
        List<Theater> theaters = movieService.getAllTheater();
        return  new ResponseEntity<>(theaters, HttpStatus.OK);
    }

    @GetMapping("getAllMoviesInSpecificTheaters")
    public ResponseEntity<Map<Integer,List<Movie>>> getAllMoviesInSpecificTheater(List<Integer> theaterIds){
        Map<Integer,List<Movie>> movieList = movieService.getTheaterWiseMovie(theaterIds);
        return new ResponseEntity<>(movieList, HttpStatus.OK);
    }
}
