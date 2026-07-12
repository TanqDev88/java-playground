package com.jorge.basicos;

import java.util.List;

public class Exercise006MixedSum {

    /**
     * Suma todos los elementos de una lista que puede contener
     * Integer y String.
     *
     * @param mixed lista con Integer o String
     * @return suma de todos los elementos
     */
    public static int sum(List<?> mixed) {

        int total = 0;

        for (Object value : mixed) {

            if (value instanceof Integer) {

                total += (Integer) value;

            } else {

                total += Integer.parseInt((String) value);

            }

        }

        return total;

    }

}