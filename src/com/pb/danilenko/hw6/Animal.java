package com.pb.danilenko.hw6;

public class Animal {

    private String food;
    private String location;
    private String name;

    public String getFood () {
        return food;
    }

    public void setFood (String food) {
        this.food = food;
    }

    public String getLocation () {
        return location;
    }

    public void setLocation (String location) {
        this.location = location;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void makeNoise(){

        System.out.println(getName()+" делает");

    }

    public void eat(){

        System.out.println(getName()+" ест");

    }

    public void sleep (){

        if (location.equals("Home"))
            System.out.println(getName()+" спит");
    }
}
