package com.jorge.fundamentals.whileloops;
import java.util.Scanner;

public class Exercise004GradeAverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;
        int suma = 0;
        int cantidad = 0;

        nota = sc.nextInt();

        while (nota != -1) {
            suma += nota;
            cantidad++;
            nota = sc.nextInt();
        }

        if (cantidad > 0) {
            System.out.println((double) suma / cantidad);
        }

        sc.close();
    }
}
