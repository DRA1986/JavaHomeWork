package com.pb.danilenko.hw7;

public class Skirt extends Clothes implements WomanClothes{

    public String model;

    public Skirt (String size, String price, String color, String model) {
        super(size, price, color);
        this.model = model;
    }
}
