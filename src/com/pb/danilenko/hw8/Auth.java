package com.pb.danilenko.hw8;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Auth {
    public static String password2;
    public static String login;
    public static String password;
    public static String login2;


    public Auth (String login, String password) {
        this.login = login;
        this.password = password;}


    protected void SignUp () {

        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        try {
            boolean log = Pattern.matches("[a-zA-Z0-9]{5,20}", login);
            if (!log) throw new WrongLoginException();
        } catch (WrongLoginException loginException) {
            loginException.printStackTrace();
            return;
        }
        System.out.println("Введите пароль для регистрации");
        System.out.println("Пароль должен быть от 5 до 20 цифер.");
        String password = sc.nextLine();
        try {
            boolean pass = Pattern.matches("[0-9]{5,20}", password);
            if (!pass) throw new WrongPassException();
        } catch (WrongPassException loginException) {
            loginException.printStackTrace();
            return;
        }
        System.out.println("Повторите пароль для регистрации");
        String password2 = sc.nextLine();
        try {

            if (password2.equals(password) == true) {
                System.out.println("Пользователь " + login + " c паролем " + password + " зарегистрирован");
            } else {
                throw new WrongPassException();
            }
        } catch (WrongPassException loginexception) {
            loginexception.printStackTrace();
        }

    }

    protected void SignIn () {

        System.out.println("Заходим в систему");
        System.out.println("Введите логин");
        Scanner sc2 = new Scanner(System.in);
        String login2 = sc2.nextLine();
        System.out.println(Auth.login);
        System.out.println(login2);
        try {
            boolean cheklog = Objects.equals(Auth.login, Auth.login2);

            if (cheklog == true) System.out.println("Логин верный " + login2);
            throw new WrongLoginException();
        } catch (WrongLoginException loginException) {

        }
    }

}
