package com.example.bookingsolutions.flipkartWalletService.entities;

import com.example.bookingsolutions.flipkartWalletService.enums.TransactionType;

import java.util.Date;

public class Transaction {
    private double amount;
    private TransactionType transactionType;
    private Date timeStamp;
    private Wallet wallet;

    public Transaction( double amount, TransactionType transactionType, Date timeStamp, Wallet wallet) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.timeStamp = timeStamp;
        this.wallet = wallet;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
