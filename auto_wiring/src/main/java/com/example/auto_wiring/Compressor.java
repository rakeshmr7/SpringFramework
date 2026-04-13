package com.example.auto_wiring;

public class Compressor {
    private int id;
    private int star;
    public Compressor(int id, int star) {
        this.id = id;
        this.star = star;
    }
    public Compressor() {
    }
    public int getId() {
        return id;
    }           
    public void setId(int id) {
        this.id = id;
    }
    public int getStar() {
        return star;
    }
    public void setStar(int star) {
        this.star = star;
    }
    @Override
    public String toString() {
        return "Compressor [id=" + id + ", star=" + star + "]";
    }
}
