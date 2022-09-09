package com.mycompany.mavenproject1;

public class ex02 {
    
  public static void main(String[] args) {

        double salario  = 1000;
        double percentual = (1.5 / 100);
        double vet[] = new double[25];
        int x;

        salario = salario + (salario * percentual);

        for (x = 0 ; x < vet.length; x++) {
            
            percentual = percentual * 2;
            salario = salario + (salario * percentual);
            vet[x] = salario;
            
             System.out.println("Salario atual do mes " + (x+1) + ": R$" + vet[x]);
        }
    }
}