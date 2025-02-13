package com.example.bookingsolutions.bookmyshowlld.modules;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Theater implements Serializable {

    private int theaterId;
    private String theaterName;
    private int pinCode;
    private List<Screen> screenList;

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theater theater = (Theater) o;
        return theaterId == theater.theaterId && pinCode == theater.pinCode && Objects.equals(theaterName, theater.theaterName) && Objects.equals(screenList, theater.screenList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theaterId, theaterName, pinCode, screenList);
    }
}
