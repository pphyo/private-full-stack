package tech.codoverse.utils;

public class MessageUtil {

    public static void showMessage(String message, String symbol) {

        String line = symbol.repeat(message.length());

        String borderLine = symbol.repeat(2) + line + symbol.repeat(2);

        String messageLine = "%s %s %s".formatted(symbol, message, symbol);

        IO.println(borderLine);
        IO.println(messageLine);
        IO.println(borderLine);
    }

}
