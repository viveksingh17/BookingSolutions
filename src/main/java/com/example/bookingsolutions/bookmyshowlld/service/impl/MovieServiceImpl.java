package com.example.bookingsolutions.bookmyshowlld.service.impl;

import com.example.bookingsolutions.bookmyshowlld.enums.MovieType;
import com.example.bookingsolutions.bookmyshowlld.enums.SeatType;
import com.example.bookingsolutions.bookmyshowlld.modules.Movie;
import com.example.bookingsolutions.bookmyshowlld.modules.Screen;
import com.example.bookingsolutions.bookmyshowlld.modules.Seat;
import com.example.bookingsolutions.bookmyshowlld.modules.Theater;
import com.example.bookingsolutions.bookmyshowlld.repository.MovieRepository;
import com.example.bookingsolutions.bookmyshowlld.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImpl implements MovieService {

    static List<Movie> movieList;
    static  List<Theater> theaterList;

    @Autowired
    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void addMovies(Movie movie) {
        Movie movie1 = new Movie();
        movie1.setMovieId(1);
        movie1.setMovieName("Bhaubali");
        movie1.setMovieType(MovieType.ACTION);
        movie1.setReleaseFormat(List.of("3d"));
        movieList.add(movie1);
        movieRepository.save(movie1);
    }

    @Override
    public List<Movie> getAllMovie() {
        return movieList;
    }

    @Override
    public void addTheater(Theater theater) {
        Seat seat1 = new Seat();
        seat1.setSeatId(1);
        seat1.setSeatNumber("1");
        seat1.setSeatPrice(193.00);
        seat1.setSeatType(SeatType.NORMAL);

        Seat seat2 = new Seat();
        seat1.setSeatId(2);
        seat1.setSeatNumber("2");
        seat1.setSeatPrice(250);
        seat1.setSeatType(SeatType.RECLINER);

        Screen s1 = new Screen();
        s1.setScreenId(1);
        s1.setCinemaId(1);
        s1.setSeatsList(List.of(seat1,seat2));


        Theater theater1 = new Theater();
        theater1.setTheaterId(1);
        theater1.setTheaterName("JHV");
        theater1.setPinCode(1234);
        theater1.setScreenList(List.of(s1));

        theaterList.add(theater1);
    }

    @Override
    public List<Theater> getAllTheater() {
        return theaterList;
    }


    //list movie show
    //book movie


    @Override
    public Map<Integer, List<Movie>> getTheaterWiseMovie(List<Integer> theaterIds) {
        Map<Integer, List<Movie>> theatherMovieMap= new HashMap<>();

        for(Theater t:theaterList){
            if(theatherMovieMap.containsKey(t)){
                List<Movie> movieList = theatherMovieMap.get(t);
//                movieList
            }
        }

        return Map.of();
    }
}
