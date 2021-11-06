package com.pb.danilenko.hw6;


import java.lang.reflect.Array;
import java.util.Arrays;

public class VetClinic extends Animal {

    public static void main (String[] args) {

        Cat cat = new Cat();
        cat.setName("TOM");
        Dog dog = new Dog();
        dog.setName("SHIBA");
        Horse horse = new Horse();
        horse.setName("MUSTANG");

        System.out.println("----------------------");
        System.out.println("Имя кота "+cat.getName());
        cat.makeNoise();
        cat.eat();

        System.out.println("----------------------");

        System.out.println("Имя собаки "+dog.getName());
        dog.makeNoise();
        dog.eat();

        System.out.println("----------------------");

        System.out.println("Имя коня "+horse.getName());
        horse.makeNoise();
        horse.eat();

        System.out.println("----------------------");


        dog.setName("Доги");
        dog.setDogfood("МЯСО и КОСТИ");
        dog.setDognoise("ФРРРР_ГАВ");
        dog.setLocation("ХЗ");

        cat.setName("Мурри");
        cat.setCatfood("МОЛОКО и СМЕТАНУ");
        cat.setCatnoise("МУРР_МЯУ");
        cat.setLocation("ДОМА");

        horse.setName("Доги");
        horse.setHorsefood("СЕНО и ТРАВВКА");
        horse.setHorsenoise("ИГОГО_ГОГО");
        horse.setLocation("ГУЛЯЕТ");

        Animal[] animals = new Animal[] {cat, dog, horse};



        System.out.println(Arrays.toString(animals));

        System.out.println("----------------------");

    }




}
