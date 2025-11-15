package tech.codoverse;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            IO.println("ငွေ %.2f ကို သွင်းပြီးပါပြီ။".formatted(amount));
        } else {
            IO.println("မှန်ကန်သည့် ပမာဏကို ဖြည့်သွင်းပါ။");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            IO.println("ထုတ်ယူမည့်ပမာဏကို မှန်ကန်စွာ ဖြည့်သွင်းပါ။");
        } else if (amount > balance) {
            IO.println("လက်ကျန်ငွေ မလုံလောက်ပါ။ သင့်လက်ကျန်ငွေမှာ %.2f သာ ရှိပါတယ်။".formatted(balance));
        } else {
            balance -= amount;
            IO.println("ငွေ %.2.f ကို ထုတ်ယူပြီးပါပြီ။".formatted(amount));
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

}
