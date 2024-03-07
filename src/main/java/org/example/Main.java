package org.example;

public class Main {
    public static void main(String[] args) {
        Product product = Product.ProductBuilder.aProduct()
                .withName("Computer")
                .withDescription("New model")
                .withPrice(17000)
                .build();

        System.out.println(product);

        // Singleton örneğine erişim
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
