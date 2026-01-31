package tech.codoverse.core;

import java.math.BigDecimal;

import tech.codoverse.model.entities.Account;
import tech.codoverse.model.entities.Income;

public class IncomeFeature extends AbstractFeature {

    public IncomeFeature(DataContext context) {
        super(3, "Add Income", context);
    }

    @Override
    public void doBusiness() {
        IO.println();
        IO.println(">> Adding Income");
        var accName = IO.readln("Account Name: ");

        var accountOpt = context.accountRepo()
                .stream()
                .filter(a -> a.getName().equalsIgnoreCase(accName))
                .findFirst();

        if (accountOpt.isEmpty()) {
            IO.println("Account not found!");
            return;
        }

        BigDecimal amount = new BigDecimal(IO.readln("Amount: "));
        String note = IO.readln("Note: ");

        Account acc = accountOpt.get();
        acc.deposit(amount);

        context.transactionRepo().save(new Income(amount, note, acc));
        IO.println("Incomed Added. New Balance: " + acc.getBalance());
    }

}
