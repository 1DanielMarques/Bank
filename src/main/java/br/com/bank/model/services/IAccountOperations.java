package br.com.bank.model.services;

import br.com.bank.model.entities.Account;

public interface IAccountOperations {

    void deposit(Account account, double amount);
    void withdraw(Account account,double amount);
    void transfer(Account account, double amount);


}
