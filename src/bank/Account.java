package bank;

import person.PersonProfile;

import java.util.ArrayList;

public interface Account {
    public PersonProfile getBankAccountHolder();
    public void setBankAccountHolder(PersonProfile bankAccountHolder);

    public String getBankAccountNum();

    public double getBalance();
    public double setBalance(double newBalance);
    public void withdraw(double amount);
    public void deposit(double amount);

    public AccountType getAccountType();

}
