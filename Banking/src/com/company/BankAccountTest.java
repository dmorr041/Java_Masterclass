package com.company;

import static org.junit.Assert.*;

public class BankAccountTest {
    String notYetImplementedFailure = "This test has yet to be implemented";
    double tolerableDelta = 0.0001;
    String mockFirstName = "Darien";
    String mockLastName = "Morrison";
    private static int count;

    private BankAccount account;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount(mockFirstName, mockLastName, 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance, tolerableDelta);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, tolerableDelta);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_ATM() throws Exception {
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");
    }

    @org.junit.Test
    public void withdraw_ATM_oldWay() throws Exception {
        try {
            account.withdraw(600.00, false);
            fail("Illegal Argument Exception should have been thrown");
        } catch (IllegalArgumentException e) { }
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), tolerableDelta);
    }

    @org.junit.Test
    public void getBalance_withdrawal() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), tolerableDelta);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("Count = " + count++);
    }
}