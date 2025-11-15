package tech.codoverse;

public class BankingApplication {

    private BankingAbstraction banking;

    public BankingApplication() {
        banking = new BankingImpl();
    }

    void main() {
        run();
    }

    void run() {
        while (true) {
            printMenu();
            int choice = Integer.parseInt(IO.readln("နံပါတ်ရွေးပါ - "));

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    IO.println("ကျေးဇူးတင်ပါတယ်။ နောက်တခါ ပြန်တွေ့ပါမယ်။");
                    return;
                default:
                    IO.println("ရွေးချယ်ထားသောနံပါတ် မှားယွင်းနေပါတယ်။​ ပြန်လည်ရွေးချယ်ပါ။");
            }
            IO.println();
        }
    }

    private void createAccount() {
        String accountHolderName = IO.readln("အကောင့်ပိုင်ရှင်နာမည် - ");
        double initialDeposit = Double.parseDouble(IO.readln("အကောင့်စဖွင့်သည့်ငွေ - "));

        BankAccount createdAccount = banking.createAccount(accountHolderName, initialDeposit);
        IO.println("အကောင့်ဖွင့်လှစ် ပြီးပါပြီ။\nသင့်အကောင့်နံပါတ်မှာ %s ဖြစ်ပါတယ်။".formatted(createdAccount.getAccountNumber()));
    }

    private void deposit() {
        String accountNumber = IO.readln("အကောင့်နံပါတ် - ");
        double amount = Double.parseDouble(IO.readln("လွှဲမည့်ပမာဏ - "));

        banking.depositToAccount(accountNumber, amount);
    }

    private void withdraw() {
        String accountNumber = IO.readln("အကောင့်နံပါတ် - ");
        double amount = Double.parseDouble(IO.readln("ထုတ်မည့်ပမာဏ - "));

        banking.withdrawFromAccount(accountNumber, amount);
    }

    private void checkBalance() {
        String accountNumber = IO.readln("အကောင့်နံပါတ် - ");
        banking.checkBalance(accountNumber);
    }

    void printMenu() {
        IO.println("===== ရိုးရှင်းဘဏ်စနစ် =====");
        IO.println("၁။ အကောင့်အသစ်ဖွင့်ရန်");
        IO.println("၂။ ငွေလွှဲရန်");
        IO.println("၃။ ငွေထုတ်ရန်");
        IO.println("၄။ လက်ကျန်ငွေစစ်ရန်");
        IO.println("၅။ ထွက်ရန်");
    }
}
