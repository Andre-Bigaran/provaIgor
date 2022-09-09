package com.mycompany.mavenproject1;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vet[] = new double[5];

        System.out.println("Informe a massa: ");
        vet[1] = sc.nextDouble();
        vet[0] = vet[1];

        while (vet[1] > 0.5) {
            vet[1] = vet[1] / 2;
            vet[2] = vet[2] + 50;
            vet[4] = vet[2] / 60;
            vet[3] = vet[2] / 3600;
        }

        System.out.println("Massa inicial: " + vet[0]);
        System.out.println("Massa final: " + vet[1]);
        System.out.println("Horas: " + vet[3]);
        System.out.println("Minutos: " + vet[4]);
        System.out.println("Segundos: " + vet[2]);

    }

}
