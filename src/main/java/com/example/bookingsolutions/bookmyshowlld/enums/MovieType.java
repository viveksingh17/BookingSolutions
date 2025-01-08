package com.example.bookingsolutions.bookmyshowlld.enums;

public enum MovieType {
    ACTION("action"),COMEDY("comedy"),SCI_FI("sci-fi");

    private final String movieType;

    MovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getMovieType() {
        return movieType;
    }
}
