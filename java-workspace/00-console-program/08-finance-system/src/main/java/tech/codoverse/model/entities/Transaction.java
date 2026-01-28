package tech.codoverse.model.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Transaction extends BaseEntity {

    protected BigDecimal amount;
    protected String note;
    protected LocalDateTime date;

    public Transaction(BigDecimal amount, String note) {
        this.amount = amount;
        this.note = note;
        this.date = LocalDateTime.now();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public abstract String getType();

}
