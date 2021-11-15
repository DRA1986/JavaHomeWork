package com.pb.danilenko.hw7;

public class Pants extends Clothes implements ManClothes,WomanClothes{

    public String model;

    public Pants (String size, String price, String color, String model) {
        super(size, price, color);
        this.model = model;
    }
}

