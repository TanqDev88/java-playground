package com.jorge.basicos;

public class Exercise003Digitize {

    /**
     * Devuelve un arreglo con los dígitos del número en orden inverso.
     *
     * @param number número entero no negativo
     * @return arreglo de enteros con los dígitos invertidos
     */
    public static int[] digitize(long number) {

        String numberAsString = String.valueOf(number);

        int[] digits = new int[numberAsString.length()];

        for (int i = 0; i < numberAsString.length(); i++) {

            char digit = numberAsString.charAt(numberAsString.length() - 1 - i);

            digits[i] = Character.getNumericValue(digit);
        }

        return digits;
    }

}