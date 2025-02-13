package com.example.bookingsolutions.flipkartWalletService.entities;

import org.springframework.graphql.data.federation.EntityMapping;

@EntityMapping
public class User{
    private long userId;
    private String name;
    private String email;
    private Wallet wallet;

    public User(long userId, String name, String email, Wallet wallet) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.wallet = wallet;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
