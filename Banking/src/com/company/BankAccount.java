package com.company;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    /**
     * Deposits to the customers account
     * @param amount - how much to deposit
     * @param branch - true if customer is performing at a branch with a teller, false if done via ATM
     * @return the new balance
     */
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    /**
     * Withdraws from the customers account
     * @param amount - how much to withdraw
     * @param branch - true if customer is performing at a branch with a teller, false if done via ATM
     * @return the new balance
     */
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    // More methods that use firstName, lastName, and perform other functions
}
