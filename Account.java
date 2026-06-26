/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author Nahin
 */
public class Account {

    // account information
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;

    // constructor to initialize account data

    public Account(String accountNumber, String accountHolder, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    //getter
    public String getAccountNumber() {    
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {   
        return interestRate;
    }

    // setter 

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    

    // method to calculate interest
   public double calculateInterest() {

        double interest = balance * interestRate;
        return interest;

    }

}
   
