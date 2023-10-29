package com.pointsApp.demo.model;

public class Merchant {

    private int id;
    private String name;

    public Merchant() {}

    public Merchant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
