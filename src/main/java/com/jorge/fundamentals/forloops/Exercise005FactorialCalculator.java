package com.jorge.fundamentals.forloops;
import java.util.Scanner;

public class Exercise005FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        sc.close();
    }
}
