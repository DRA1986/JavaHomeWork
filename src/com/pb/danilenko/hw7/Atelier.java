package com.pb.danilenko.hw7;


public abstract class Atelier implements ManClothes, WomenClothes {

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
                new Tshirt(Size.S, 58.75f, "желтый"),
                new Pants(Size.M, 105.50f, "черный"),
                new Skirt(Size.M, 78.45f, "зеленый"),
                new Tie(Size.XXS, 15.20f, "красный")
        };

        dressMan(clothes);

        System.out.println();

        dressWomen(clothes);
    }

    //-------------------------------- methods ---------------------------

    private static void dressMan(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}