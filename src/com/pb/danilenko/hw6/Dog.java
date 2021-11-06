package com.pb.danilenko.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private String name;
    private String dogfood;
    private String dognoise;
    private String location;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDogfood () {
        return dogfood;
    }

    public void setDogfood (String dogfood) {
        this.dogfood = dogfood;
    }

    public String getDognoise () {
        return dognoise;
    }

    public void setDognoise (String dognoise) {
        this.dognoise = dognoise;
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
        System.out.println(getName()+" ЕСТ МЯСО");
    }

    @Override
    public void makeNoise () {
        super.makeNoise();
        System.out.println("ГАВ-ГАВ");
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(dogfood, dog.dogfood) && Objects.equals(dognoise, dog.dognoise) && Objects.equals(location, dog.location);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, dogfood, dognoise, location);
    }

    @Override
    public String toString () {
        return "Dog{" +
                "name='" + name + '\'' +
                ", dogfood='" + dogfood + '\'' +
                ", dognoise='" + dognoise + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
