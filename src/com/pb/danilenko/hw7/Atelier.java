package com.pb.danilenko.hw7;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class Atelier implements ManClothes,WomanClothes {

    public static void main(String[] Arg) {

        Tshirt tshirts = new Tshirt ("XXS","200","green","Leto");
        Pants pants = new Pants("XS","150","Blue","Osen");
        Skirt skirts = new Skirt("S","300","red","Vesna");
        Tie ties = new Tie("L","500","white","Leto");


        Clothes[] clothes = new Clothes[]{tshirts, pants, skirts, ties};



        System.out.println("Мужики");
        ManClothes.dressman(clothes);
        System.out.println("---------");
        System.out.println("Бабы");
        WomanClothes.dresswoman(clothes);
        System.out.println("---------");

        System.out.println(deepToString(clothes));
        System.out.println((clothes));
        
    }
}
