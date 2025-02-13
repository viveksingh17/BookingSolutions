package com.example.bookingsolutions.bookmyshowlld.modules;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Booking implements Serializable {
    private int bookingId;
    private int showId;
    private List<ShowSeat> bookedSeats;
    private double totalAmount;
    private int userId;


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public List<ShowSeat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<ShowSeat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId && showId == booking.showId && Double.compare(totalAmount, booking.totalAmount) == 0 && userId == booking.userId && Objects.equals(bookedSeats, booking.bookedSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, showId, bookedSeats, totalAmount, userId);
    }
}
