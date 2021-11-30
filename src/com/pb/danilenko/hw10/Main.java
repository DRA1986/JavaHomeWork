package com.pb.danilenko.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> nbi = new NumBox<Integer>(5);
        try {
            nbi.add(3);
            nbi.add(2);
            nbi.add(4);
            nbi.add(6);
            nbi.add(9);
        } catch (Exception e) {
            System.err.println("Невозможно добавить элемент." +
                    "\nМассив переполнен!");
        }
        System.out.println("-------Массив целых чисел-------");
        System.out.println("Количество элементов массива: " + nbi.length());
        System.out.println("Среднее значение элемента: " + nbi.average());
        System.out.println("Сумма элементов массива: " + nbi.sum());
        System.out.println("Max элемент массива: " + nbi.max());
        System.out.println();
        NumBox<Float> nbf = new NumBox<Float>(4);
        try {
            nbf.add(9.1F);
            nbf.add(6.2F);
            nbf.add(4.3F);
            nbf.add(2.4F);
        } catch (Exception e) {
            System.err.println("Массив переполнен!");
        }
        System.out.println("-------Массив любых чисел-------");
        System.out.println("Количество элементов массива: " + nbf.length());
        System.out.println("Среднее значение элемента: " + nbf.average());
        System.out.println("Сумма элементов массива: " + nbf.sum());
        System.out.println("Max элемент массива: " + nbf.max());
    }
}