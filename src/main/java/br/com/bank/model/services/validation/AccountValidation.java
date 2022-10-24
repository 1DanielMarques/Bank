package br.com.bank.model.services.validation;

import br.com.bank.model.entities.Account;

public class AccountValidation implements IValidation{
    @Override
    public boolean isDepositValid(double amount) {
        return false;
    }

    @Override
    public boolean isWithdrawValid(Account account, double amount) {
        return false;
    }

    @Override
    public boolean isTransferValid(Account origin, double amount, Account destiny) {
        return false;
    }
}
