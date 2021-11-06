package com.pb.danilenko.hw6;

import java.util.Objects;

public class Horse extends Animal{

    private String name;
    private String horsefood;
    private String horsenoise;
    private String location;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getHorsefood () {
        return horsefood;
    }

    public void setHorsefood (String horsefood) {
        this.horsefood = horsefood;
    }

    public String getHorsenoise () {
        return horsenoise;
    }

    public void setHorsenoise (String horsenoise) {
        this.horsenoise = horsenoise;
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
        System.out.println("СЕНО");
    }

    @Override
    public void makeNoise () {
        super.makeNoise();
        System.out.println("IGO-GO");
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) && Objects.equals(horsefood, horse.horsefood) && Objects.equals(horsenoise, horse.horsenoise) && Objects.equals(location, horse.location);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, horsefood, horsenoise, location);
    }

    @Override
    public String toString () {
        return "Horse{" +
                "name='" + name + '\'' +
                ", horsefood='" + horsefood + '\'' +
                ", horsenoise='" + horsenoise + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
