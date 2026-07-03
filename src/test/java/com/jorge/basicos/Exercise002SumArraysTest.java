package com.jorge.basicos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise002SumArraysTest {

    @Test
    void shouldReturnSumOfPositiveAndNegativeNumbers() {

        double[] numbers = {1, 5.2, 4, 0, -1};

        assertEquals(9.2, Exercise002SumArrays.sum(numbers));
    }

    @Test
    void shouldReturnNegativeNumberWhenArrayContainsOnlyOneNegativeNumber() {

        double[] numbers = {-2.398};

        assertEquals(-2.398, Exercise002SumArrays.sum(numbers));
    }

    @Test
    void shouldReturnZeroWhenArrayIsEmpty() {

        double[] numbers = {};

        assertEquals(0, Exercise002SumArrays.sum(numbers));
    }

}