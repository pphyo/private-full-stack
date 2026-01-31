package tech.codoverse.core;

import java.math.BigDecimal;

import tech.codoverse.model.entities.Transfer;
import tech.codoverse.model.exceptions.FinanaceSystemException;

public class TransferFeature extends AbstractFeature {

    public TransferFeature(DataContext context) {
        super(5, "Transfer Money", context);
    }

    @Override
    public void doBusiness() {
        try {
            IO.println();
            IO.println(">> Transfer");

            String fromName = IO.readln("From Account: ");
            String toName = IO.readln("To Account: ");

            BigDecimal amount = new BigDecimal(IO.readln("Amount: "));

            var from = context.accountRepo().stream()
                    .filter(a -> a.getName().equalsIgnoreCase(fromName))
                    .findFirst()
                    .orElseThrow(() -> new FinanaceSystemException("Account not found!"));

            var to = context.accountRepo().stream()
                    .filter(a -> a.getName().equalsIgnoreCase(toName))
                    .findFirst()
                    .orElseThrow(() -> new FinanaceSystemException("Account not found!"));

            from.withdraw(amount);
            to.deposit(amount);
            context.transactionRepo().save(new Transfer(amount, "Transfer", from, to));
        } catch (Exception e) {
            IO.println("Transfer Failed: " + e.getMessage());
        }
    }

}
