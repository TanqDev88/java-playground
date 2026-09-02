package com.jorge.fundamentals.condicionales;
import java.util.Scanner;

public class Exercise005DiscountSystem {
    /*Ejercicio 5 - Sistema de descuentos

       Solicitar el monto de una compra y aplicar:
        20% de descuento si supera $100.000.
        10% de descuento si supera $50.000.
        Sin descuento en otro caso.

       Mostrar:
        Monto original.
        Descuento aplicado.
        Total final.

       Utilizar operador ternario para determinar si hubo descuento.

    Conceptos: if anidados + operador ternario.*/

    public static void main(String[] args) {
        System.out.println("Ingresar el monto de la compra: ");
        Scanner sc = new Scanner(System.in);

        double monto = sc.nextDouble();

        double descuento;

        if (monto > 100000) {
            descuento = monto * 0.20;
        } else if (monto > 50000) {
            descuento = monto * 0.10;
        } else {
            descuento = 0;
        }

        double total = monto - descuento;

        String aplica = descuento > 0 ? "Si" : "No";

        System.out.println("Descuento: " + descuento);
        System.out.println("Aplica: " + aplica);
        System.out.println("Total: " + total);

        sc.close();
    }
}
