package com.jorge.basicos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise001EvenOrOddTest {

    @Test
    void shouldReturnOddForPositiveOddNumber() {
        assertEquals("Odd", Exercise001EvenOrOdd.evenOrOdd(1));
    }

    @Test
    void shouldReturnEvenForPositiveEvenNumber() {
        assertEquals("Even", Exercise001EvenOrOdd.evenOrOdd(2));
    }

    @Test
    void shouldReturnOddForNegativeOddNumber() {
        assertEquals("Odd", Exercise001EvenOrOdd.evenOrOdd(-1));
    }

    @Test
    void shouldReturnEvenForNegativeEvenNumber() {
        assertEquals("Even", Exercise001EvenOrOdd.evenOrOdd(-2));
    }

    @Test
    void shouldReturnEvenForZero() {
        assertEquals("Even", Exercise001EvenOrOdd.evenOrOdd(0));
    }

}