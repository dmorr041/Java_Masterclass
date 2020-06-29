package com.company;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    /**
     * Deposits to the customers account
     * @param amount how much to deposit
     * @param branch true if customer is performing at a branch with a teller, false if done via ATM
     * @return the new balance
     */
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    /**
     * Withdraws from the customers account
     * @param amount how much to withdraw
     * @param branch true if customer is performing at a branch with a teller, false if done via ATM
     * @return the new balance
     */
    public double withdraw(double amount, boolean branch) {
        if ((amount > 500.00) && !branch) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return this.accountType == CHECKING;
    }
}
