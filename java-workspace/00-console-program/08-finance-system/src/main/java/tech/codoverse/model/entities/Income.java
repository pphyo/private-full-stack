package tech.codoverse.model.entities;

import java.math.BigDecimal;

public class Income extends Transaction {

    private Account toAccount;

    public Income(BigDecimal amount, String note, Account toAccount) {
        super(amount, note);
        this.toAccount = toAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    @Override
    public String getType() {
        return "INCOME";
    }
}
