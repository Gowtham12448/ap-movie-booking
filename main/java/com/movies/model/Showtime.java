package com.movies.model;

public class Showtime {
    private String time;
    private double price;

    public Showtime(String time, double price) {
        this.time = time;
        this.price = price;
    }

    public String getTime() { return time; }
    public double getPrice() { return price; }
}
