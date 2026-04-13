package com.example.simple_ecommerce;

public class Cart {
    private Product product;
    private int totalPrice;

    public Cart(Product product) {
        this.product = product;
    }

    public Cart() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.totalPrice = (int) (product.getPrice() * product.getQuantity());
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart [product=" + product + ", totalPrice=" + totalPrice + "]";
    }

}
