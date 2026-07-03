package com.jorge.basicos;

public class Exercise002SumArrays {
    public static double sum(double[] numbers) {

        double total = 0;

        for (double number : numbers) {
            total += number;
        }

        return total;
    }
}
