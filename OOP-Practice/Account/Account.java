/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String accountNumber;
    private final String owner;
    private double balance;

    public Account(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Account[Number=" + accountNumber + ", Owner=" + owner + ", Balance=" + balance + "]";
    }
}

// Bank.java
class Bank {
    private final List<Account> accounts;

    public Bank() { accounts = new ArrayList<>(); }

    public void addAccount(Account account) { accounts.add(account); }
    public void removeAccount(String accountNumber) {
        accounts.removeIf(acc -> acc.getAccountNumber().equals(accountNumber));
    }

    public Account findAccount(String accountNumber) {
        for(Account acc : accounts) {
            if(acc.getAccountNumber().equals(accountNumber)) return acc;
        }
        return null;
    }

    public void displayAccounts() {
        System.out.println("Bank Accounts:");
        for(Account acc : accounts) System.out.println(acc);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("001", "Alice", 1000);
        Account a2 = new Account("002", "Bob", 2000);

        bank.addAccount(a1);
        bank.addAccount(a2);

        bank.displayAccounts();

        a1.deposit(500);
        a2.withdraw(1500);

        System.out.println("\nAfter transactions:");
        bank.displayAccounts();

        bank.removeAccount("001");
        System.out.println("\nAfter removing Alice's account:");
        bank.displayAccounts();
    }
}
