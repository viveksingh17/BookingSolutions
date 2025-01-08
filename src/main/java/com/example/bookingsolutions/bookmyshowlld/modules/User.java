package com.example.bookingsolutions.bookmyshowlld.modules;


import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userID == user.userID && Float.compare(funds, user.funds) == 0 && Objects.equals(userName, user.userName) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, address, funds);
    }

    private int userID;
    private String userName;
    private String address;
    private float funds;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getFunds() {
        return funds;
    }

    public void setFunds(float funds) {
        this.funds = funds;
    }
}
