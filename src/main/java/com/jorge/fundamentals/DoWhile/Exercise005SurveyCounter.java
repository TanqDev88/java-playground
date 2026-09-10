package com.jorge.fundamentals.DoWhile;
import java.util.Scanner;

public class Exercise005SurveyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char respuesta;
        int contador = 0;

        do {
            contador++;
            respuesta = sc.next().charAt(0);

        } while (respuesta == 'S' || respuesta == 's');

        System.out.println(contador);

        sc.close();
    }
}
