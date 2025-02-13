package com.example.bookingsolutions.bookmyshowlld.modules;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class MovieShow implements Serializable {

    private  int showId;
    private String showDateTime;
    private int theaterId;
    private int screenId;
    private int movieId;
    private List<Seat> availableSets;

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public String getShowDateTime() {
        return showDateTime;
    }

    public void setShowDateTime(String showDateTime) {
        this.showDateTime = showDateTime;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public List<Seat> getAvailableSets() {
        return availableSets;
    }

    public void setAvailableSets(List<Seat> availableSets) {
        this.availableSets = availableSets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieShow movieShow = (MovieShow) o;
        return showId == movieShow.showId && theaterId == movieShow.theaterId && screenId == movieShow.screenId && movieId == movieShow.movieId && Objects.equals(showDateTime, movieShow.showDateTime) && Objects.equals(availableSets, movieShow.availableSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showId, showDateTime, theaterId, screenId, movieId, availableSets);
    }
}
