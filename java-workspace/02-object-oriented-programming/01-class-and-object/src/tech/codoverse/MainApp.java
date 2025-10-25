package tech.codoverse;

public class MainApp {

    public static void main(String[] args) {

    }

    void run() {
        // object creation, initialization, init
        Product iPhone = new Product();
        Product vJun = new Product();

        iPhone.stock++;
        Product.count++;

        vJun.stock++;
        Product.count++;

        System.out.println("iPhone stock: " + iPhone.stock);
        System.out.println("V.June stock: " + vJun.stock);
        System.out.println("id: " + Product.count);
    }

}