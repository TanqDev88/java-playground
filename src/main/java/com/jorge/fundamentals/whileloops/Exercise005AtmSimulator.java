package com.jorge.fundamentals.whileloops;
import java.util.Scanner;

public class Exercise005AtmSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 100000;
        double retiro;

        retiro = sc.nextDouble();

        while (retiro != 0) {

            if (retiro <= saldo) {
                saldo -= retiro;
            }

            System.out.println("Saldo: " + saldo);

            retiro = sc.nextDouble();
        }

        sc.close();
    }
}