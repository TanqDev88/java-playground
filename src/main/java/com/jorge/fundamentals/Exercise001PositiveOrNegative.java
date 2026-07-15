package com.jorge.fundamentals;

import java.util.Scanner;

public class Exercise001PositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El numero es menor a cero");
        } else if (numero > 0) {
            System.out.println("El numero es mayor a cero");
        } else {
            System.out.println("El numero es cero");
        }
        System.out.println("Fin de la ejecucion");
        sc.close();
    }

}