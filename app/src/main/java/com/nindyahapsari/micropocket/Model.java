package com.nindyahapsari.micropocket;

public class Model {

    private String brand;
    private String description;
    private String dummytext;


    public Model(String brand, String description, String dummytext) {
        this.brand = brand;
        this.description = description;
        this.dummytext = dummytext;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getDummytext() {
        return dummytext;
    }
}


