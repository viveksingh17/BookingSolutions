package com.example.bookingsolutions.bookmyshowlld.enums;

public enum SeatType {
    NORMAL("normal"),RECLINER("recliner");

    private final String seatType;

    SeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatType() {
        return seatType;
    }
}
