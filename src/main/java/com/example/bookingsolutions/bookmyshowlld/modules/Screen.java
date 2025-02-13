package com.example.bookingsolutions.bookmyshowlld.modules;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Screen implements Serializable {
    private int screenId;
    private int theaterId;
    private List<Seat> seatsList;

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getCinemaId() {
        return theaterId;
    }

    public void setCinemaId(int theaterId) {
        this.theaterId = theaterId;
    }

    public List<Seat> getSeatsList() {
        return seatsList;
    }

    public void setSeatsList(List<Seat> seatsList) {
        this.seatsList = seatsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Screen screen = (Screen) o;
        return screenId == screen.screenId && theaterId == screen.theaterId && Objects.equals(seatsList, screen.seatsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenId, theaterId, seatsList);
    }
}
