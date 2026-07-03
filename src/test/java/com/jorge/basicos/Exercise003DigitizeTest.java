package com.jorge.basicos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise003DigitizeTest {

    @Test
    void shouldReturnDigitsInReverseOrder() {

        assertArrayEquals(
                new int[]{1, 3, 2, 5, 3},
                Exercise003Digitize.digitize(35231)
        );

    }

    @Test
    void shouldReturnZeroWhenNumberIsZero() {

        assertArrayEquals(
                new int[]{0},
                Exercise003Digitize.digitize(0)
        );

    }

    @Test
    void shouldReturnSingleDigit() {

        assertArrayEquals(
                new int[]{7},
                Exercise003Digitize.digitize(7)
        );

    }

}