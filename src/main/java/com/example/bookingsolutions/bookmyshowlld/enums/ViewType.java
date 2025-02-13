package com.example.bookingsolutions.bookmyshowlld.enums;

public enum ViewType {
    SIMPLE("2d"),THREE_D("3D");

    ViewType(String movieType) {
        this.movieType = movieType;
    }

    private final String movieType;

    public String getMovieType() {
        return movieType;
    }
}
