package tech.codoverse;

public abstract class BankingAbstraction {

    public abstract BankAccount createAccount(String accountHolderName, double initialDeposit);

    public abstract BankAccount findAccount(String accountNumber);

    public abstract void depositToAccount(String accountNumber, double amount);

    public abstract void withdrawFromAccount(String accountNumber, double amount);

    public abstract void checkBalance(String accountNumber);

}
