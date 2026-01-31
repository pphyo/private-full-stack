package tech.codoverse.core;

import java.math.BigDecimal;
import java.util.Comparator;

import tech.codoverse.model.entities.Account;
import tech.codoverse.model.entities.Transaction;

public class ReportFeature extends AbstractFeature {

    public ReportFeature(DataContext context) {
        super(6, "View Report", context);
    }

    @Override
    public void doBusiness() {
        IO.println();
        IO.println("=== FINANCIAL REPORT ===");

        BigDecimal totalAsset = context.accountRepo().stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        IO.println("Total Net Worth: " + totalAsset);

        IO.println("\nLast 5 Transactions:");
        context.transactionRepo().stream()
                .sorted(Comparator.comparing(Transaction::getDate).reversed())
                .limit(5)
                .forEach(t -> IO.println("%s : %s : %s".formatted(t.getType(), t.getNote(), t.getAmount())));
    }

}
