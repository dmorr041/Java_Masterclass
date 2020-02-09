package academy.learnprogramming;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double fundsToAdd) {
        System.out.println("Balance before deposit: " + this.balance);
        this.balance += fundsToAdd;
        System.out.println("Balance after deposit: " + this.balance);
    }

    public void withdrawFunds(double fundsToWithdraw) {
        if (this.balance - fundsToWithdraw < 0) {
            System.out.println("Insufficient Funds.");
        } else {
            System.out.println("Balance before withdrawal: " + this.balance);
            this.balance -= fundsToWithdraw;
            System.out.println("Balance after withdrawal: " + this.balance);
        }
    }

}
