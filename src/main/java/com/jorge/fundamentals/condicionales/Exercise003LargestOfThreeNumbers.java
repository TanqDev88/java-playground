package com.jorge.fundamentals.condicionales;
import java.util.Scanner;

public class Exercise003LargestOfThreeNumbers {
    /*Ejercicio 3 - Número mayor entre tres

        Solicitar tres números enteros.
        Determinar cuál es el mayor y mostrarlo.

    Conceptos: if anidados.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el 1");
        int a = sc.nextInt();
        System.out.println("Ingrese el 2");
        int b = sc.nextInt();
        System.out.println("Ingrese el 3");
        int c = sc.nextInt();

        int mayor = a;

        if (b > mayor){
            mayor = b;
        }if (c > mayor){
            mayor = c;
        }

        System.out.println("El numero mayor es el " + mayor);
    }
}
