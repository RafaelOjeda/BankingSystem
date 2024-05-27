package bank;

public interface Account {
    String bankAccountHolder = "";
    String bankAccountNum = "";
    double balance = 0;

    public String getBankAccountHolder();
    public void setBankAccountHolder(String bankAccountHolder);

    public String getBankAccountNum();

    public double getBalance();
    public void withdraw(double amount);
    public void deposit(double amount);


}
