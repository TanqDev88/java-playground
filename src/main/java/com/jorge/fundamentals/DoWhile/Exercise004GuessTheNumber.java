package com.jorge.fundamentals.DoWhile;
import java.util.Scanner;

public class Exercise004GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            numero = sc.nextInt();

            if (numero > 15) {
                System.out.println("Mayor");
            } else if (numero < 15) {
                System.out.println("Menor");
            }

        } while (numero != 15);

        System.out.println("Correcto");

        sc.close();
    }
}
