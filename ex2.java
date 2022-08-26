package com.mycompany.prova;

public class ex2 {

    public static void main(String[] args) {

        double percentual = 0;
        double salario = 1000;
        int x, i = 0;

        percentual = (1.5 / 100);
        salario = salario + (salario * percentual);

        for (x = 1997; x < 2022; x++) {
            percentual = percentual * 2;
            salario = salario + (salario * percentual);
        }

        System.out.println("Salario atual de " + x + ": R$" + salario);
    }
}
