package com.pb.danilenko.hw7;

public class Tshirt extends Clothes implements ManClothes,WomanClothes{

    public String model;

    public Tshirt (String size, String price, String color, String model) {
        super(size, price, color);
        this.model = model;
    }
}
