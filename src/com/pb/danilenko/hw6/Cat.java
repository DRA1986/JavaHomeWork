package com.pb.danilenko.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String name;
    private String catfood;
    private String catnoise;
    private String location;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getCatfood () {
        return catfood;
    }

    public void setCatfood (String catfood) {
        this.catfood = catfood;
    }

    public String getCatnoise () {
        return catnoise;
    }

    public void setCatnoise (String catnoise) {
        this.catnoise = catnoise;
    }

    @Override
    public String getLocation () {
        return location;
    }

    @Override
    public void setLocation (String location) {
        this.location = location;
    }

    @Override
    public void eat () {
        super.eat();
        System.out.println("РЫБУ");
    }

    @Override
    public void makeNoise () {
        super.makeNoise();
        System.out.println("МЯУ-МЯУ");
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(catfood, cat.catfood) && Objects.equals(catnoise, cat.catnoise) && Objects.equals(location, cat.location);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, catfood, catnoise, location);
    }

    @Override
    public String toString () {
        return "Cat " +
                "name= " + name + '\'' +
                ", catfood='" + catfood + '\'' +
                ", catnoise='" + catnoise + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
