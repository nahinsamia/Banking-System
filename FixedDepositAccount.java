/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author Nahin
 */

// FixedDepositAccount inherits Account class
class FixedDepositAccount extends Account {

    // extra variable for fixed deposit account
    private int depositYears;

    public int getDepositYears() {
        return depositYears;
    }

    public void setDepositYears(int depositYears) {
        this.depositYears = depositYears;
    }
    

    // constructor
    public FixedDepositAccount(String accountNumber, String accountHolder,
            double balance, double interestRate, int depositYears) {

        // call parent constructor
        super(accountNumber, accountHolder, balance, interestRate);

        // set deposit years
        this.depositYears = depositYears;

    }

    // overriding interest calculation
    @Override
    public double calculateInterest() {

        double interest = getBalance() * getInterestRate();
        return interest;

    }

}
