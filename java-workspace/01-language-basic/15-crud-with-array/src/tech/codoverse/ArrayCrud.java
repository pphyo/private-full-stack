package tech.codoverse;

public class ArrayCrud {

    private static int[] DATA = new int[0];

    // insert from first
    // homework
    void addFirst(int value) {
        // to do
    }

    // insert at specific index
    // homework
    void add(int index, int value) {
        // to do
    }

    // insert from last
    void addLast(int value) {
        int[] temp = new int[DATA.length + 1];

        // copy value from DATA to temp
        for (int i = 0; i < DATA.length; i++) {
            temp[i] = DATA[i];
        }

        temp[temp.length - 1] = value;
        DATA = temp;
    }

    // update array value at specific index
    void update(int index, int newValue) {
        checkArray(index);
        DATA[index] = newValue;
    }

    // delete array at specific index
    void delete(int index) {
        checkArray(index);

        int[] temp = new int[DATA.length - 1];

        for (int i = 0; i < DATA.length; i++) {
            if (i == index) {
                continue;
            }
            if (i > index) {
                temp[i - 1] = DATA[i];
            } else {
                temp[i] = DATA[i];
            }
        }

        DATA = temp;
    }

    // display all elements in array
    // if no data in array, display "No data."
    // if one data in array display "Data in array is 10."
    // otherwise, display "Data in array are 2, 5, 1, 30."
    void display() {
        if (0 == DATA.length) {
            System.out.println("No data");
        } else {

            System.out.print("Data in array %s ".formatted(DATA.length == 1 ? "is" : "are"));

            for (int i = 0; i < DATA.length; i++) {
                if (i != DATA.length - 1) {
                    System.out.print("%d, ".formatted(DATA[i]));
                } else {
                    System.out.print("%d.".formatted(DATA[i]));
                }
            }
            System.out.println();
        }
    }

    int size() {
        return DATA.length;
    }

    void checkArray(int index) {
        if (index >= DATA.length) {
            System.out.println("Please enter correct index.");
            return;
        }
    }
}
