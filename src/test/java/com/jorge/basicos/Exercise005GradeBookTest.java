package com.jorge.basicos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise005GradeBookTest {

    @Test
    void shouldReturnGradeA() {

        assertEquals('A',
                Exercise005GradeBook.getGrade(95, 90, 93));

    }

    @Test
    void shouldReturnGradeB() {

        assertEquals('B',
                Exercise005GradeBook.getGrade(80, 82, 84));

    }

    @Test
    void shouldReturnGradeC() {

        assertEquals('C',
                Exercise005GradeBook.getGrade(70, 75, 79));

    }

    @Test
    void shouldReturnGradeD() {

        assertEquals('D',
                Exercise005GradeBook.getGrade(60, 65, 69));

    }

    @Test
    void shouldReturnGradeF() {

        assertEquals('F',
                Exercise005GradeBook.getGrade(20, 40, 50));

    }

}