package com.pb.danilenko.hw8;


public class OnlineShop {


    public static void main (String[] args) throws WrongLoginException {

        System.out.println("Введите логин для регистрации.");
        System.out.println("Логин должен быть от 5 до 20 символов. Логин должен содержать только латинские буквы и цифры.");

        Auth user = new Auth(Auth.login, Auth.password);

        user.SignUp();
        System.out.println("----------------------------");
       user.SignIn();


    }

}



