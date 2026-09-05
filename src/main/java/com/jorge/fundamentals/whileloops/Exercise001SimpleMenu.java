package com.jorge.fundamentals.whileloops;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise001SimpleMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;

                case 2:
                    System.out.println(LocalDate.now());
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
