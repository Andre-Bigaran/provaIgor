package com.mycompany.andrevetor;
import java.util.Scanner;

public class ex01 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5];
        int x, maior = 0, menor = 0;
        
        System.out.println("Insira 5 numeros inteiros: ");
        
        for(x = 0; x < vet.length; x++) {
            System.out.println((x+1)+ "Insira numero: ");
            vet[x] = sc.nextInt();
            
             if (x == 0) {
                maior = vet[x];
                menor = vet[x];
            }
            if (vet[x] > maior) {
                maior = vet[x];
            }
            else if (vet[x] < menor) {
                menor = vet[x];
            }
            
    }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}



           

     
