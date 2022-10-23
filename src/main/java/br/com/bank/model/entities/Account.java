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

    public void deposit(Account account, double amount) {
        operations.deposit(account, amount);
    }

    public void withdraw(Account account, double amount) {
        operations.withdraw(account, amount);
    }

    public void transfer(double amount, Account other) {
        operations.transfer(this, amount, other);
    }
}
