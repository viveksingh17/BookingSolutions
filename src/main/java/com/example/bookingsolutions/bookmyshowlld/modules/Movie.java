package com.example.bookingsolutions.bookmyshowlld.modules;

import com.example.bookingsolutions.bookmyshowlld.enums.MovieType;
import com.example.bookingsolutions.bookmyshowlld.enums.ViewType;
import org.springframework.graphql.data.federation.EntityMapping;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@EntityMapping
public class Movie implements Serializable {

    private int movieId;
    private String movieName;
    private MovieType movieType;
    private List<String> releaseFormat;
    private List<Theater> threaterList;
    private List<ViewType> viewTypesList;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public List<String> getReleaseFormat() {
        return releaseFormat;
    }

    public void setReleaseFormat(List<String> releaseFormat) {
        this.releaseFormat = releaseFormat;
    }

    public List<Theater> getThreaterList() {
        return threaterList;
    }

    public void setThreaterList(List<Theater> threaterList) {
        this.threaterList = threaterList;
    }

    public List<ViewType> getViewTypesList() {
        return viewTypesList;
    }

    public void setViewTypesList(List<ViewType> viewTypesList) {
        this.viewTypesList = viewTypesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movieId == movie.movieId && Objects.equals(movieName, movie.movieName) && movieType == movie.movieType && Objects.equals(releaseFormat, movie.releaseFormat) && Objects.equals(threaterList, movie.threaterList) && Objects.equals(viewTypesList, movie.viewTypesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, movieName, movieType, releaseFormat, threaterList, viewTypesList);
    }
}
