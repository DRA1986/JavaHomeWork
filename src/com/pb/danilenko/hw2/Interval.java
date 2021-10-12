package com.pb.danilenko.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        int operand1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в чудо сортировщк");
        System.out.println("Сейчас вы вводите число и мы скажем в какой дипазон оно попадает");
        System.out.println("Введите число");
        operand1 = scan.nextInt();
      if (0<=operand1 & operand1<=14) {System.out.println("Вы меткий и попали между 0 и 14");}
      if (15<=operand1 & operand1<=35) {System.out.println("Вы меткий и попали между 15 и 35");}
      if (36<=operand1 & operand1<=50) {System.out.println("Вы меткий и попали между 36 и 50");}
      if (51<=operand1 & operand1<=100) {System.out.println("Вы меткий и попали между 51 и 100");}
      else {System.out.println("Выберите диапазон от 0 до 100");}
    }
}
