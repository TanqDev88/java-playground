package com.jorge.basicos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise006MixedSumTest {

    @Test
    void shouldReturnTwentyTwo() {

        List<?> values = List.of(9, 3, "7", "3");

        assertEquals(22,
                Exercise006MixedSum.sum(values));

    }

    @Test
    void shouldReturnTwenty() {

        List<?> values = List.of("5", "0", 9, 3, 2, 1);

        assertEquals(20,
                Exercise006MixedSum.sum(values));

    }

    @Test
    void shouldReturnFortyOne() {

        List<?> values = List.of("3", 6, 6, 0, "5", 8, 5, "6", 2, "0");

        assertEquals(41,
                Exercise006MixedSum.sum(values));

    }

}