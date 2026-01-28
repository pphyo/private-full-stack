package tech.codoverse.core;

import tech.codoverse.data.Repository;
import tech.codoverse.model.entities.*;

public record DataContext(
                Repository<Account> accountRepo,
                Repository<Transaction> transactionRepo,
                Repository<Category> categoryRepo,
                Repository<Budget> budgetRepo) {

}
