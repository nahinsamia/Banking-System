/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankingsystem;

/**
 *
 * @author Nahin
 */
// main class to test the banking system
public class BankingSystem {

    public static void main(String[] args) {

        // creating objects of different account types
        SavingsAccount s = new SavingsAccount("101", "Samia", 10000, 0.05, 5);

        CheckingAccount c = new CheckingAccount("102", "Nahin", 15000, 0.04, 100);

        FixedDepositAccount f = new FixedDepositAccount("103", "Rahim", 20000, 0.06, 3);


        // displaying interest for each account
        System.out.println("Savings Interest = " + s.calculateInterest());

        System.out.println("Checking Interest = " + c.calculateInterest());

        System.out.println("Fixed Deposit Interest = " + f.calculateInterest());

    }

}