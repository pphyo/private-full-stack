import static java.lang.IO.*;

final int BITS = 8;

void main() {
    var message = readln("Message: ");

    for (int codePoint : message.toCharArray()) {

        int[] bitArray = new int[BITS];

        for (int i = 0; i < BITS; i++) {
            codePoint = codePoint / 2;
            bitArray[i] = codePoint % 2;
        }
        printResult(bitArray);
    }
}

void printResult(int[] array) {
    for (var i : array) {
        if (i == 0) {
            print('\u26ab');
        } else {
            print('\u26aa');
        }
    }
    println();
}