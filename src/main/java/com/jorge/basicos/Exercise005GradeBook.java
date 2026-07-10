package com.jorge.basicos;

public class Exercise005GradeBook {

    /**
     * Calcula el promedio de tres notas y devuelve
     * la calificación correspondiente.
     *
     * @param score1 primera nota
     * @param score2 segunda nota
     * @param score3 tercera nota
     * @return A, B, C, D o F
     */
    public static char getGrade(int score1, int score2, int score3) {

        int average = (score1 + score2 + score3) / 3;

        if (average >= 90) {
            return 'A';
        }

        if (average >= 80) {
            return 'B';
        }

        if (average >= 70) {
            return 'C';
        }

        if (average >= 60) {
            return 'D';
        }

        return 'F';

    }

}
