package tech.codoverse.core;

import java.math.BigDecimal;

import tech.codoverse.model.entities.Category;
import tech.codoverse.model.entities.Expense;
import tech.codoverse.model.exceptions.FinanaceSystemException;

public class ExpenseFeature extends AbstractFeature {

    public ExpenseFeature(DataContext context) {
        super(4, "Add Expense", context);
    }

    @Override
    public void doBusiness() {
        IO.println();
        try {
            IO.println(">> Adding Expense");

            String accName = IO.readln("Account Name: ");
            var account = context.accountRepo().stream()
                    .filter(a -> a.getName().equalsIgnoreCase(accName))
                    .findFirst()
                    .orElseThrow(() -> new FinanaceSystemException("Account not found"));

            String catName = IO.readln("Category: ");
            Category category = context.categoryRepo().stream()
                    .filter(c -> c.getName().equalsIgnoreCase(catName))
                    .findFirst()
                    .orElseGet(() -> {
                        Category c = new Category(catName);
                        context.categoryRepo().save(c);
                        return c;
                    });

            BigDecimal acmount = new BigDecimal(IO.readln("Amount: "));
            String note = IO.readln("Note: ");

            account.withdraw(acmount);
            context.transactionRepo().save(new Expense(acmount, note, account, category));
            IO.println("Expnese Recorded.");
        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    }

}
