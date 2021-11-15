package com.pb.danilenko.hw7;

interface WomanClothes {

    static void dresswoman (Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof Pants || item instanceof Tshirt || item instanceof Tie) {
                item.dresswoman();
            }


        }

    }

}
