/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author Nahin
 */

// CheckingAccount inherits Account class
public class CheckingAccount extends Account {

    // extra variable for checking account
    private double transactionFee;

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
    

    // constructor
    public CheckingAccount(String accountNumber, String accountHolder,
            double balance, double interestRate, double transactionFee) {

        // call parent constructor
        super(accountNumber, accountHolder, balance, interestRate);

        // set transaction fee
        this.transactionFee = transactionFee;

    }

    // overriding interest calculation
    @Override
    public double calculateInterest() {

        double interest = getBalance() * getInterestRate();
        return interest;

    }

}
