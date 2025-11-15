package tech.codoverse;

import java.util.HashMap;
import java.util.Map;

public class BankingImpl extends BankingAbstraction {

    private Map<String, BankAccount> accounts;

    public BankingImpl() {
        this.accounts = new HashMap<>();
    }

    @Override
    public BankAccount createAccount(String accountHolderName, double initialDeposit) {
        String newAccountNumber = String.valueOf(1001 + accounts.size());
        BankAccount newAccount =
                new BankAccount(newAccountNumber, accountHolderName, initialDeposit);
        accounts.put(newAccountNumber, newAccount);
        return newAccount;
    }

    @Override
    public BankAccount findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    @Override
    public void depositToAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            IO.println("အကောင့်မတွေ့ပါ။");
        }
    }

    @Override
    public void withdrawFromAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            IO.println("အကောင့်မတွေ့ပါ။");
        }
    }

    @Override
    public void checkBalance(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            IO.println("အကောင့်ပိုင်ရှင် - " + account.getAccountHolderName());
            IO.println("လက်ကျန်ငွေ - %.2f ကျပ်".formatted(account.getBalance()));
        } else {
            IO.println("အကောင့်မတွေ့ပါ။");
        }
    }

}
