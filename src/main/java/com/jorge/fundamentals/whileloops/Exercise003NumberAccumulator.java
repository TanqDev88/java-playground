package com.jorge.fundamentals.whileloops;
import java.util.Scanner;

public class Exercise003NumberAccumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            numero = sc.nextInt();
        }

        System.out.println(suma);

        sc.close();
    }
}