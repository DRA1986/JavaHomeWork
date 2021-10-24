package com.pb.danilenko.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {

        Random random = new Random();
        int r = random.nextInt(101);
        Scanner scan = new Scanner(System.in);
        boolean x1 = false;
        boolean x2 = false;



        System.out.println("Поиграем в отгадайку ");

        for (int counter = 0; counter < 100; counter++) {
            System.out.println("Введите число от 0 до 100 ");
            System.out.println("Чтобы выйти введите ex");

            if (scan.hasNext("ex")) x1 = true;
            if (x1 == true) {
                System.out.println("Выходим");
                break;
            }
            if (scan.hasNextInt() == true) {
                int x = scan.nextInt();
                if (x > r) System.out.println("Ввели больше чем надо");
                if (x < r) System.out.println("Ввели меньше чем надо");
                if (x == r) {
                    System.out.println("Угадали");
                    System.out.println("Попытка номер " + counter);
                    break;
                }

            } else
            {System.out.println("Вводить можно только числа");break; }
        }
    }
}