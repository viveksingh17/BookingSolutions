package com.example.bookingsolutions.bookmyshowlld.enums;


public enum SeatStatus {
    BOOKED("booked"),FREE("free"),LOCKED("locked");

    private final String showStatus;

    public String getShowStatus() {
        return showStatus;
    }

    SeatStatus(String showStatus) {
        this.showStatus = showStatus;
    }
}
