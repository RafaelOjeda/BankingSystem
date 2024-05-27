package bank;

import person.PersonProfile;

public class Checkings extends PersonalAccount {
    final private AccountType accountType = AccountType.CHECKINGS;

    public Checkings(PersonProfile personProfile, double startingBalance) {
        super(personProfile, startingBalance);

    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String toString() {
        return "Checkings:\n" + super.toString();
    }
}
