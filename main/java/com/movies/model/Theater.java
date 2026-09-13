package com.movies.model;

public class Theater {
    private int id;
    private String name;
    private String location;
    private String address;

    public Theater(int id, String name, String location, String address) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.address = address;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getAddress() { return address; }
}
