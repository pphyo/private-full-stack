package tech.codoverse;

public class ConsoleCalculator {

    private String appName;
    private AbstractFeature[] features;

    public ConsoleCalculator(String appName, AbstractFeature[] features) {
        this.appName = appName;
        this.features = features;
    }

    void launch() {
        // show application name
        showMessage(appName, "=");

        do {
            IO.println();
            // show menus and get menu id
            AbstractFeature feature = getSelectedFeature();

            IO.println();
            // show feature
            showMessage(feature.getFeatureName(), "*");
            IO.println();

            // execute selected feature of do business
            feature.doBusiness();

            // ask to contiue
        } while (askToContinue());

        // bye bye
        showMessage("Thank you", "-");
    }

    private AbstractFeature getSelectedFeature() {
        for (var feature : features) {
            feature.showMenu();
        }
        IO.println();
        var selectedId = Integer.parseInt(IO.readln("Choose: "));
        return features[selectedId - 1];
    }

    private boolean askToContinue() {
        var answer = IO.readln("Do you want start again? (y/others): ");
        return answer.equalsIgnoreCase("y");
    }

    private void showMessage(String message, String symbol) {
        String line = symbol.repeat(message.length());

        String borderLine = symbol.repeat(2) + line + symbol.repeat(2);

        String messageLine = "%s %s %s".formatted(symbol, message, symbol);

        IO.println(borderLine);
        IO.println(messageLine);
        IO.println(borderLine);
    }

}
