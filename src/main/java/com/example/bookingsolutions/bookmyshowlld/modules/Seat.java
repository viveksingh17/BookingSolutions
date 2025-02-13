package com.example.bookingsolutions.bookmyshowlld.modules;

import com.example.bookingsolutions.bookmyshowlld.enums.SeatType;

import java.io.Serializable;
import java.util.Objects;

public class Seat implements Serializable {

    private int seatId;
    private String seatNumber;
    private int screenId;
    private SeatType seatType;
    private double seatPrice;

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return seatId == seat.seatId && screenId == seat.screenId && Double.compare(seatPrice, seat.seatPrice) == 0 && Objects.equals(seatNumber, seat.seatNumber) && seatType == seat.seatType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatId, seatNumber, screenId, seatType, seatPrice);
    }
}
