package com.pb.danilenko.hw7;

public class Tie extends Clothes implements ManClothes{

    public String model;

    public Tie (String size, String price, String color, String model) {
        super(size, price, color);
        this.model = model;
    }
}
