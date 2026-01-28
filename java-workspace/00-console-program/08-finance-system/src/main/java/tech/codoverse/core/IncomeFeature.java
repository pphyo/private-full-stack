package tech.codoverse.core;

public class IncomeFeature extends AbstractFeature {

    public IncomeFeature(DataContext context) {
        super(3, "Add Income", context);
    }

    @Override
    public void doBusiness() {
        IO.println(">> Adding Income");
        var accName = IO.readln("Account Name: ");

        var accountOpt = context.accountRepo()
                .stream()
                .filter(a -> a.getName().equalsIgnoreCase(accName))
                .findFirst();

        if (accountOpt.isEmpty()) {
            IO.println("Account not found!");
            return;
        }
    }

}
