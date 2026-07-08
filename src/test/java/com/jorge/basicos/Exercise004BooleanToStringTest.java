package com.jorge.basicos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise004BooleanToStringTest {

    @Test
    void shouldReturnTrueWhenBooleanIsTrue() {

        assertEquals("true",
                Exercise004BooleanToString.convert(true));

    }

    @Test
    void shouldReturnFalseWhenBooleanIsFalse() {

        assertEquals("false",
                Exercise004BooleanToString.convert(false));

    }

}