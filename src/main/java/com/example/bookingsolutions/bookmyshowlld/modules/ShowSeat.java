package com.example.bookingsolutions.bookmyshowlld.modules;

import com.example.bookingsolutions.bookmyshowlld.enums.SeatStatus;

import java.io.Serializable;
import java.util.Objects;

public class ShowSeat implements Serializable {
    private int showSeatId;
    private int seatId;
    private float price;
    private SeatStatus seatStatus;

    public int getShowSeatId() {
        return showSeatId;
    }

    public void setShowSeatId(int showSeatId) {
        this.showSeatId = showSeatId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowSeat showSeat = (ShowSeat) o;
        return showSeatId == showSeat.showSeatId && seatId == showSeat.seatId && Float.compare(price, showSeat.price) == 0 && seatStatus == showSeat.seatStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(showSeatId, seatId, price, seatStatus);
    }
}
