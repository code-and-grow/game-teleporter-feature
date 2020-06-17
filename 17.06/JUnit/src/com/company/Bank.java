package com.company;

public class Bank {
    private int balance;
    private BankType bank;

    public Bank(int balance, BankType bank) {
        this.balance = balance;
        this.bank = bank;
    }

    public int getBalance() {
        return balance;
    }

    public BankType getBank() {
        return bank;
    }

    public void withdraw(int money) {
        this.balance-=money;
    }

    public void deposit(int money) {
        this.balance+=money;
    }

    public int maxValue(int a, int b) {
        return a > b ? a : b;

//        if (a > b) {
//          return a;
//        } else {
//            return b;
//        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", bank=" + bank +
                '}';
    }
}
