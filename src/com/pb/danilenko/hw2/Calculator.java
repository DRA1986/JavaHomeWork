package com.pb.danilenko.hw2;

import java.util.Scanner;

public class Calculator{

        public static void main(String[] args) {
        int operand1;
        int operand2;
        int answer =0;
        char sign;


        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в автоматические счеты.");
        System.out.println("Мы умеем добавлять отнимать делить и умножать. Но пока только целые числа.");
        System.out.println("Введите первое число");
        operand1 = scan.nextInt();
        System.out.println("X = " +operand1);
        System.out.println("Введите второе число");
        operand2 = scan.nextInt();
        System.out.println("Y = " +operand2);
        System.out.println("Какую операцию будем делать? +, -, *, / ");
        sign = scan.next().charAt(0);

    switch (sign) {
        case '+':
            answer = operand1 + operand2;
            break;
        case '-':
            answer = operand1 - operand2;
            break;
        case '/':
            if (operand2==0) {System.out.println("На ноль делить нельзя, попробуйте заново.");}
            else {answer = operand1 / operand2;}
            break;
        case '*':
            answer = operand1 * operand2;
            break;
        default:
            throw new IllegalStateException("Что то пошло не так и вы ввели букву " + sign);
    }
            System.out.println("X = " + operand1 + " Y = " + operand2 + " Операция = " + sign);
            System.out.println("Ответ: " + answer);
    }
}
