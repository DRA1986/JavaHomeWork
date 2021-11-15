package com.pb.danilenko.hw7;

interface ManClothes {



        static void dressman (Clothes[] clothes) {
            System.out.println("Мужская одежда:");
            for (Clothes item : clothes) {
                if (item instanceof Pants || item instanceof Tshirt || item instanceof Tie) {
                    item.dressman();
                }

            }




        }

    }
