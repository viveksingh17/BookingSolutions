package com.example.bookingsolutions.flipkartWalletService.entities;

import java.util.List;


public class Wallet {
    private long walletId;
    private double balance;
    private List<Transaction> transcationsList;

    public Wallet(long walletId, double balance, List<Transaction> transcationsList) {
        this.walletId = walletId;
        this.balance = balance;
        this.transcationsList = transcationsList;
    }

    public long getWalletId() {
        return walletId;
    }

    public void setWalletId(long walletId) {
        this.walletId = walletId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTranscationsList() {
        return transcationsList;
    }

    public void setTranscationsList(List<Transaction> transcationsList) {
        this.transcationsList = transcationsList;
    }
}
