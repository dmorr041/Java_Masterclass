package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {
    private BankAccount account;
    private final double amount;
    private final boolean branch;
    private final double expected;
    private String mockFirstName;
    private String mockLastName;
    private static final double tolerableDelta = 0.0001;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00},
        });
    }

    @org.junit.Before
    public void Setup() {
        account = new BankAccount(mockFirstName, mockLastName, 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), tolerableDelta);
    }
}
