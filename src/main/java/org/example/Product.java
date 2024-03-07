package org.example;

public class Product {
    private String name;
    private double price;
    private String description;


    public static final class ProductBuilder {
        private String name;
        private double price;
        private String description;

        private ProductBuilder() {//constructor
        }

        public static ProductBuilder aProduct() {
            return new ProductBuilder();
        }

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.price = this.price;
            product.name = this.name;
            product.description = this.description;
            return product;
        }
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
