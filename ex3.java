package com.mycompany.prova;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double massa = 0, massaI;
        double tempo = 50, segundos = 0, minutos = 0, horas = 0;
        int i = 0;

        System.out.println("Informe a massa: ");
        massa = sc.nextDouble();
        massaI = massa;

        while (massa > 0.5) {
            massa = massa / 2;
            i++;
        }

        tempo = tempo * i;
        segundos = tempo;
        minutos = tempo / 60;
        horas = minutos / 60;

        System.out.println("Massa inicial: " + massaI);
        System.out.println("Massa final: " + massa);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

    }

}
