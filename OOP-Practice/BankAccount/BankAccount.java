/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

/**
 *
 * @author Administrator
 */
@SupportedSourceVersion(SourceVersion.RELEASE_21)
public class BankAccount {
     private final String accountNumber;
    private final String accountHolderName;
    protected double balance;  // protected to allow subclass access

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        System.out.println("Current balance: $" + balance);
        return balance;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private final double interestRate;  // in percentage, e.g., 5 for 5%

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " applied at rate " + interestRate + "%. New balance: $" + balance);
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Create a BankAccount
        BankAccount account1 = new BankAccount("123456", "Alice Smith", 1000);
        account1.displayAccountInfo();
        account1.deposit(500);
        account1.withdraw(200);
        account1.checkBalance();

        System.out.println("\n--- Savings Account ---\n");

        SavingsAccount savings1 = new SavingsAccount("987654", "Bob Johnson", 2000, 5);
        savings1.displayAccountInfo();
        savings1.deposit(300);
        savings1.withdraw(100);
        savings1.applyInterest();
        savings1.checkBalance();

    }
}
