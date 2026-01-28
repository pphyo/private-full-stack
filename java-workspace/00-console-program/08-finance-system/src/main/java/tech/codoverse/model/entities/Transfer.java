package tech.codoverse.model.entities;

import java.math.BigDecimal;

public class Transfer extends Transaction {

    private Account fromAccount;
    private Account toAccount;

    public Transfer(BigDecimal amount, String note, Account fromAccount, Account toAccount) {
        super(amount, note);
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    @Override
    public String getType() {
        return "TRANSFER";
    }

}
