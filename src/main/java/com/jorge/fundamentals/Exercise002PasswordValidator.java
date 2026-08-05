package com.jorge.fundamentals;
import java.util.Scanner;


public class Exercise002PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "java123";
        String ingreso = "";

        while (!ingreso.equals(password)) {
            ingreso = sc.nextLine();
        }

        System.out.println("Acceso permitido");

        sc.close();
    }
}
