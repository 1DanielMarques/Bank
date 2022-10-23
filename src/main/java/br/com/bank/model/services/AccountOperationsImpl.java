package br.com.bank.model.services;

import br.com.bank.model.entities.Account;

public class AccountOperationsImpl implements IAccountOperations {
    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void transfer(Account account, double amount) {

    }
}
