package com.jorge.fundamentals;
import java.util.Scanner;

public class Exercise004EvenNumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println(contador);

        sc.close();
    }
}
