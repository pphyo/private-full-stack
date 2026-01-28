package tech.codoverse.model.entities;

import java.math.BigDecimal;

public class Expense extends Transaction {

    private Account fromAccount;
    private Category category;

    public Expense(BigDecimal amount, String note, Account fromAccount, Category category) {
        super(amount, note);
        this.fromAccount = fromAccount;
        this.category = category;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String getType() {
        return "EXPENSE";
    }
}
