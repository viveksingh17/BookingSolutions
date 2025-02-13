package com.example.bookingsolutions.flipkartWalletService.service;

import com.example.bookingsolutions.flipkartWalletService.entities.Transaction;
import com.example.bookingsolutions.flipkartWalletService.entities.User;
import com.example.bookingsolutions.flipkartWalletService.entities.Wallet;
import com.example.bookingsolutions.flipkartWalletService.enums.TransactionType;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.stream.Collectors;

public class WalletService {
    Map<Long,User> userMap = new HashMap<>();
    // Add users
    public void addUser(User user){
        userMap.put(user.getUserId(),user);
    }

    // print balances
    public void printBalances(){
        userMap.values().forEach(user -> {
            System.out.println(user.getUserId() + " " + user.getName()+" " + user.getWallet().getBalance());
        });
    }

    //Add money
    public boolean addMoney(long userId,double amount){
        boolean isValid = validate(amount);
        User user = userMap.get(userId);
        if(user!=null){
            Wallet wallet = user.getWallet();
            wallet.setBalance(wallet.getBalance()+amount);
            wallet.getTranscationsList().add(new Transaction(amount, TransactionType.CREDIT,new Date(),wallet));
        } else{
            isValid = false;
        }
        return  isValid;
    }

    //transaction money
    public boolean transactMoney(long fromUserId, long toUserId,double amount){

        boolean isValid = validate(amount);
        User senderUserId = userMap.get(fromUserId);
        User receiverUserId = userMap.get(toUserId);
        if(senderUserId != null || receiverUserId !=null && senderUserId.getWallet().getBalance()>=amount){
            Wallet sWallet = senderUserId.getWallet();
            Wallet rWallet = receiverUserId.getWallet();
            sWallet.setBalance(sWallet.getBalance()-amount);
            rWallet.setBalance(rWallet.getBalance()+amount);
            senderUserId.getWallet().getTranscationsList().add(new Transaction(amount,TransactionType.DEBIT,new Date(),sWallet));
            receiverUserId.getWallet().getTranscationsList().add(new Transaction(amount,TransactionType.CREDIT,new Date(),sWallet));
        } else{
            isValid = false;
        }

        return isValid;
    }
    private boolean validate(double amount){
        return amount >0 ;
    }


    //fetch transactions

    public List<Transaction> getListTransaction(long userId, String sortBy){
        User user = userMap.get(userId);
        if(user!=null){
            List<Transaction> transactionsList = user.getWallet().getTranscationsList();
            if("amount".equalsIgnoreCase(sortBy)){
               return transactionsList.stream().sorted(Comparator.comparingDouble(Transaction::getAmount)).toList();
            } else if("dateTime".equalsIgnoreCase(sortBy)){
                return transactionsList.stream().sorted(Comparator.comparing(Transaction::getTimeStamp)).toList();
            }
        }
        return List.of();
    }
}
