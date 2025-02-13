package com.example.bookingsolutions.flipkartWalletService.controller;

import com.example.bookingsolutions.flipkartWalletService.entities.Transaction;
import com.example.bookingsolutions.flipkartWalletService.entities.User;
import com.example.bookingsolutions.flipkartWalletService.entities.Wallet;
import com.example.bookingsolutions.flipkartWalletService.service.WalletService;

import java.util.ArrayList;
import java.util.List;

public class FlipkartWalletController {


    public static void main(String args[]){
        WalletService walletService = new WalletService();
//        private long userId;
//        private String name;
//        private String email;
//        private Wallet wallet;
        User user1 = new User(1L,"vivek","v@gmail.com",new Wallet(1L,100.0,new ArrayList<>()));
        User user2 = new User(2L,"saloni","s@gmail.com",new Wallet(2L,200.0,new ArrayList<>()));
        User user3 = new User(3L,"sani","sani@gmail.com",new Wallet(3L,300.0,new ArrayList<>()));

        walletService.addUser(user1);
        walletService.addUser(user2);
        walletService.addUser(user3);

        System.out.println("Intial Balances");
        walletService.printBalances();

        walletService.addMoney(1L,300);
        walletService.transactMoney(2L,1L,100);
        walletService.addMoney(2L,500);
        walletService.transactMoney(2L,3L,200);
        System.out.println("Later Balances");
        walletService.printBalances();

        List<Transaction> transactionList = walletService.getListTransaction(2L,"amount");

        transactionList.forEach(e-> System.out.println( e.getTransactionType() + " " + e.getAmount()));

        //load money

        //get Details
    }

}
