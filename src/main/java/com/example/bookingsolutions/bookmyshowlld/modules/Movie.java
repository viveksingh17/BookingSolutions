package com.example.bookingsolutions.bookmyshowlld.modules;

import com.example.bookingsolutions.bookmyshowlld.enums.MovieType;

import java.io.Serializable;
import java.util.List;

public class Movie implements Serializable {

    private int movieId;
    private String movieName;
    private MovieType movieType;
    private List<String> releaseFormat;
    private List<Theater> threaterList;


}
