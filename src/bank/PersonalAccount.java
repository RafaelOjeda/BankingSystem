package bank;

import person.PersonProfile;

public abstract class PersonalAccount implements Account {

        private AccountType accountType;
        private double balance;
        private PersonProfile bankAccountHolder;

        public PersonalAccount(PersonProfile bankAccountHolder, double startingBalance) {
            this.balance = startingBalance;
            this.bankAccountHolder = bankAccountHolder;
        }

        @Override
        public PersonProfile getBankAccountHolder() {
            return bankAccountHolder;
        }

        @Override
        public void setBankAccountHolder(PersonProfile bankAccountHolder) {
            this.bankAccountHolder = bankAccountHolder;
        }

        @Override
        public String getBankAccountNum() {
            return "";
        }

        @Override
        public double getBalance() {
            return balance;
        }

        @Override
        public double setBalance(double newBalance) {
            return this.balance = newBalance;
        }

        @Override
        public void withdraw(double amount) {
            setBalance(getBalance() - amount);
        }

        @Override
        public void deposit(double amount) {
            setBalance(getBalance() + amount);
        }

        @Override
        public AccountType getAccountType() {
            return accountType;
        }

        public String toString() {
            return "[" + bankAccountHolder.getFirstName() + ", " + getAccountType() + ", " + getBankAccountNum() + ", " + getBalance() + "]";
        }
}
