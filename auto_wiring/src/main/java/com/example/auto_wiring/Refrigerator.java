package com.example.auto_wiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Refrigerator {
    private int id;
    private String brand;
    private double price;

    @Autowired
    private Compressor compressor;
    
    public Refrigerator(int id, String brand, double price, Compressor compressor) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.compressor = compressor;
    }

    public Refrigerator() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Compressor getCompressor() {
        return compressor;
    }

    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    @Override
    public String toString() {
        return "Refrigerator [id=" + id + ", brand=" + brand + ", price=" + price + ", compressor=" + compressor + "]";
    }
    
}
