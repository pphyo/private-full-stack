package tech.codoverse.core;

import java.math.BigDecimal;

import tech.codoverse.model.entities.Account;

public class AccountFeature extends AbstractFeature {

    public AccountFeature(DataContext context) {
        super(1, "Manage Accounts", context);
    }

    @Override
    public void doBusiness() {
        IO.println();
        IO.println(">> Account Magagement");
        IO.println("1. List All Accounts");
        IO.println("2. Create New Account");

        String choice = IO.readln("Choose 1 or 2: ");

        if (choice.equals("1")) {
            listAccounts();
        } else if (choice.equals("2")) {
            createAccount();
        } else {
            IO.println("Invalid option.");
        }

    }

    private void listAccounts() {
        IO.println("\n--- Your Accounts ---");
        var accounts = context.accountRepo().findAll();

        if (accounts.isEmpty()) {
            IO.println("No account found.");
        } else {
            accounts.forEach(acc -> IO.println("- %s : %,.2f MMK".formatted(acc.getName(), acc.getBalance())));
        }
    }

    private void createAccount() {
        String name = IO.readln("Enter Account Name: ");
        boolean exists = context.accountRepo().stream()
                .anyMatch(a -> a.getName().equalsIgnoreCase(name));
        if (exists) {
            IO.println("Error: Account '" + name + "' already exists!");
            return;
        }

        try {
            BigDecimal balance = new BigDecimal(IO.readln("Initial Balance: "));
            Account newAccount = new Account(name, balance);
            context.accountRepo().save(newAccount);
            IO.println("Success! Account '" + name + "' created.");
        } catch (NumberFormatException e) {
            IO.println("Error: Invalid amount format.");
        }
    }

}
