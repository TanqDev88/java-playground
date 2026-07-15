package com.jorge.fundamentals;
import java.util.Scanner;

public class Exercise002AgeValidator {

    /*Solicitar la edad de una persona.

      Mostrar:
        "Menor de edad" si tiene menos de 18 años.
        "Mayor de edad" si tiene 18 años o más.

      Conceptos: if - else.*/

    public static void main(String[] args) {
        System.out.println("Ingrese la edad:");

        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();
        if(edad < 18){
            System.out.println(edad + " Es menor de edad");
        }else {
            System.out.println(edad + " Es mayor de edad");
        }
        System.out.println("Fin de la ejecucion");

        sc.close();

    }
}
