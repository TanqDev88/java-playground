package com.jorge.fundamentals;

import java.util.Scanner;

public class Exercise004BasicCalculator {
    /*Ejercicio 4 - Calculadora básica

    Solicitar:
        Primer número.
        Segundo número.
        Operación (+, -, *, /).
        Utilizar un switch para realizar la operación seleccionada.
        Validar división por cero.

    Conceptos: switch.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double primerNumero = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = sc.nextDouble();
        System.out.println("Ingrese la operacion a realizar");
        char operacion = sc.next().charAt(0);

        double resultado = 0;
        boolean hayResultado = true;

        switch (operacion) {
            case '+':
                resultado = primerNumero + segundoNumero;
                break;

            case '-':
                resultado = primerNumero - segundoNumero;
                break;

            case '*':
                resultado = primerNumero * segundoNumero;
                break;

            case '/':
                if (segundoNumero !=0) {
                    resultado = primerNumero / segundoNumero;
                }
                else {
                    System.out.println("ERROR: No se puede dividir por cero");
                    hayResultado = false;
                }
                break;

            default:
                System.out.println("ERROR: Operacion invalida");
                hayResultado = false;

        }

        if(hayResultado){
            System.out.println("El resultado es: " + resultado);
        }

        sc.close();
    }
}
