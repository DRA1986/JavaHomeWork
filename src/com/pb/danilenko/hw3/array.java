package com.pb.danilenko.hw3;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];//создаем  массив размером 10
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();// заполняем массив с клавиатуры
        }

        System.out.println("Заполненый массив");
        for (int i = 0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");// Выводим заполненый массив на экран
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        System.out.println("Сумма элементов массива");
        System.out.println(sum); // сумма элементов массива


        int num = 0;
        for (int i=0 ; i< mas.length; i++){
            if (mas[i]>0 ){  // элементы больше нуля
                num++;
            }
        }
        System.out.println("Количество элементов больше нуля  =  "+ num);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(mas));


    }
}