package br.com.bank.model.entities;

public class Holder {

    private String name;
    private String email;
    private String cpf;
    private Account account;

    public Holder(String name, String email, String cpf, Account account) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
