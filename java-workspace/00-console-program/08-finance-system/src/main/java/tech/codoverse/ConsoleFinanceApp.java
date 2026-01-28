package tech.codoverse;

import tech.codoverse.core.AbstractFeature;
import tech.codoverse.core.AccountFeature;
import tech.codoverse.core.CategoryFeature;
import tech.codoverse.core.DataContext;
import tech.codoverse.data.Repository;
import tech.codoverse.model.entities.Account;
import tech.codoverse.model.entities.Budget;
import tech.codoverse.model.entities.Category;
import tech.codoverse.model.entities.Transaction;

public class ConsoleFinanceApp {

    void main() {
        var accountRepo = new Repository<Account>();
        var transactionRepo = new Repository<Transaction>();
        var categoryRepo = new Repository<Category>();
        var budgetRepo = new Repository<Budget>();

        var context = new DataContext(accountRepo, transactionRepo, categoryRepo, budgetRepo);

        var accountFeat = new AccountFeature(context);
        var categoryFeat = new CategoryFeature(context);

        var features = new AbstractFeature[] {
                accountFeat,
                categoryFeat
        };

        launch(context, features);
    }

    private void launch(DataContext context, AbstractFeature[] features) {
        init(context.categoryRepo());

        IO.println("=== SMART FINANCE MANAGER");
        boolean running = true;
        while (running) {
            IO.println();

            for (var f : features) {
                f.showMenu();
            }

            try {
                String input = IO.readln("\nSelect Option (or 'q' to quit): ");

                if (input.equalsIgnoreCase("q")) {
                    running = false;
                    continue;
                }

                int id = Integer.parseInt(input);

                if (id > 0 && id <= features.length) {
                    features[id - 1].doBusiness();
                } else {
                    IO.println("Invalid Option");
                }
            } catch (Exception e) {
                IO.println("Invalid input");
            }
        }
    }

    private void init(Repository<Category> categoryRepo) {
        categoryRepo.save(new Category("Bills"));
        categoryRepo.save(new Category("Car"));
        categoryRepo.save(new Category("Health"));
        categoryRepo.save(new Category("Clothing"));
        categoryRepo.save(new Category("Education"));
    }

}