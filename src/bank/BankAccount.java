package bank;

import person.PersonProfile;

public abstract class BankAccount {
    String bankAccountHolder;
    private String bankAccountNum;
    private Double balance;

    public BankAccount(PersonProfile personProfile) {
        bankAccountHolder = personProfile.getFirstName() + " " + personProfile.getLastName();
        balance = 0.0;
    }
    public abstract void deposit(double amount, BankAccount account);
    public abstract void withdraw();
    public final double getBalance() {
        return balance;
    }
}
