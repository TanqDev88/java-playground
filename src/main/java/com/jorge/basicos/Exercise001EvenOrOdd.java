package com.jorge.basicos;

public class Exercise001EvenOrOdd {

    /**
     * Devuelve "Even" si el número es par o "Odd" si es impar.
     *
     * @param number número entero
     * @return "Even" o "Odd"
     */
    public static String evenOrOdd(int number) {

        if (number % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }

}