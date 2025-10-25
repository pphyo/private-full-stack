import static tech.codoverse.utils.MessageUtil.showMessage;
import static java.lang.IO.*;
import static java.util.Arrays.copyOf;

int start = 0, end = 0;

void main() {
    launch();
}

void launch() {
    // show welcome message
    showMessage("Welcome to Prime Number Program", "*");

    String answer = null;

    do {

        println();
        // get start number
        start = Integer.parseInt(readln("Enter start number: "));

        // get end number
        end = Integer.parseInt(readln("Enter end number: "));

        checkStartAndEnd();

        // find prime numbers between start and end
        int[] primes = findPrimeNumbers();

        // show prime numbers
        printPrimeNumbers(primes);
        println();

        answer = readln("Want to play again? (y/others): ");
    } while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));

    println();

    showMessage("Thank you for playing", "*");
}

void printPrimeNumbers(int[] primes) {
    println();

    if (primes.length == 0) {
        println("No prime number.");
    } else {
        String message = "Prime %s between %d and %d %s".formatted(primes.length == 1 ? "number" : "numbers", start, end,
                primes.length == 1 ? "is " : "are ");
        print(message);
        for (int i = 0, l = primes.length; i < l; i++) {
            if (i == primes.length - 1) {
                print(primes[i] + ".");
            } else {
                print(primes[i] + ", ");
            }
        }
        println();
    }
}

int[] findPrimeNumbers() {
    int[] primes = {};
    for (int i = start; i <= end; i++) {
        if (isPrime(i)) {
            primes = copyOf(primes, primes.length + 1);
            primes[primes.length - 1] = i;
        }
    }

    return primes;
}

void checkStartAndEnd() {
    while (start > end || (start < 0 && end < 0)) {
        println();
        println("Wrong start and end number!");
        println();

        // get start number
        start = Integer.parseInt(readln("Enter start number again: "));

        // get end number
        end = Integer.parseInt(readln("Enter end number again: "));
    }
}

boolean isPrime(int number) {
    if (number < 2)
        return false;

    for (int i = 2; i < number; i++) {
        if (number % i == 0)
            return false;
    }

    return true;
}
