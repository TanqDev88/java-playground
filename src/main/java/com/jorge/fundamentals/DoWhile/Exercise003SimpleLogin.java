package com.jorge.fundamentals.DoWhile;
import java.util.Scanner;

public class Exercise003SimpleLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            numero = sc.nextInt();
        } while (numero < 0);

        System.out.println(numero);

        sc.close();
    }
}