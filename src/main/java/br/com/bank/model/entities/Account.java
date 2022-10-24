package br.com.bank.model.entities;

import br.com.bank.model.services.IAccountOperations;

public class Account {

    private int number;
    private double balance;

    private IAccountOperations operations;

    public Account(int number, double balance, IAccountOperations operations) {
        this.number = number;
        this.balance = balance;
        this.operations = operations;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        operations.deposit(this, amount);
    }

    public void withdraw(double amount) {
        operations.withdraw(this, amount);
    }

    public void transfer(double amount, Account other) {
        operations.transfer(this, amount, other);
    }
}
