/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author Nahin
 */
// SavingsAccount inherits Account class
public class SavingsAccount extends Account {

    // extra variable for savings account
   private  int withdrawLimit;

   // constructor
    public SavingsAccount(String accountNumber, String accountHolder,
            double balance, double interestRate, int withdrawLimit) {

        // calling parent constructor
        super(accountNumber, accountHolder, balance, interestRate);

        // set withdraw limit
        this.withdrawLimit = withdrawLimit;

    }



    // override method
    @Override
    public double calculateInterest() {

        double interest = getBalance() * getInterestRate();
        return interest;

    }

    public int getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(int withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
    

}


 
