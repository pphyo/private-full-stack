package tech.codoverse.core;

import tech.codoverse.model.entities.Category;

public class CategoryFeature extends AbstractFeature {

    public CategoryFeature(DataContext context) {
        super(2, "Manage Categories", context);
    }

    @Override
    public void doBusiness() {
        IO.println(">> Category Management");
        IO.println("1. List Categories");
        IO.println("2. Add New Category");

        String choice = IO.readln("Choose 1 or 2: ");

        if (choice.equals("1")) {
            context.categoryRepo().stream().map(Category::getName).forEach(name -> IO.println("- " + name));
        } else if (choice.equals("2")) {
            String name = IO.readln("Enter Category Name: ");

            if (context.categoryRepo().stream().anyMatch(c -> c.getName().equalsIgnoreCase(name))) {
                IO.println("Category already exists.");
            } else {
                context.categoryRepo().save(new Category(name));
            }
        } else {
            IO.println("Invalid option.");
        }
    }

}
