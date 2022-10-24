package br.com.bank.model.entities;

import br.com.bank.model.services.operations.AccountOperationsImpl;
import br.com.bank.model.services.operations.IAccountOperations;
import br.com.bank.model.services.validation.AccountValidation;
import br.com.bank.model.services.validation.IValidation;

public class Account {

    private int number;
    private double balance;

    private IAccountOperations operations;
    private IValidation validation;

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
        this.operations = new AccountOperationsImpl();
        this.validation = new AccountValidation();
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

    // Should I create my own exception?
    public void deposit(double amount) {
        if (validation.isDepositValid(amount)) {
            operations.deposit(this, amount);
        } else {
            throw new IllegalArgumentException("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (validation.isWithdrawValid(this, amount)) {
            operations.withdraw(this, amount);
        } else {
            throw new IllegalArgumentException("Invalid amount!");
        }
    }

    public void transfer(double amount, Account other) {
        if (validation.isTransferValid(this, amount, other)) {
            operations.transfer(this, amount, other);
        } else {
            throw new IllegalArgumentException("Invalid amount!");
        }
    }
}
