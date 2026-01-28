package tech.codoverse.model.entities;

import java.math.BigDecimal;

import tech.codoverse.model.exceptions.InsufficientAmountException;

public class Account extends BaseEntity {

    private String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws InsufficientAmountException {
        if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientAmountException("Insufficient balance in " + name);
        }
        this.balance = this.balance.subtract(amount);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "%s : %,.2f MMK".formatted(name, balance);
    }

}
