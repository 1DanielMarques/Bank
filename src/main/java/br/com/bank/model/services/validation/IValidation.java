package br.com.bank.model.services.validation;

import br.com.bank.model.entities.Account;

public interface IValidation {

    boolean isDepositValid(double amount);

    boolean isWithdrawValid(Account account, double amount);

    boolean isTransferValid(Account origin, double amount, Account destiny);


}
