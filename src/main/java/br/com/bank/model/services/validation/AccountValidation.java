package br.com.bank.model.services.validation;

import br.com.bank.model.entities.Account;

public class AccountValidation implements IValidation {
    @Override
    public boolean isDepositValid(double amount) {
        if (amount > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isWithdrawValid(Account account, double amount) {
        if(amount > 0 && amount < account.getBalance()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean isTransferValid(Account origin, double amount, Account destiny) {
        return false;
    }
}
