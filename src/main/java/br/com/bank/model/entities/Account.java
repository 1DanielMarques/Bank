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
