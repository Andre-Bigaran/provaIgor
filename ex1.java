
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numb, maior = 0, menor = 0;
        int x;

        System.out.println("Insira 5 valores inteiros: ");

        for (x = 0; x < 5; x++) {

            System.out.print((x + 1) + "- Insira numero: ");
            numb = sc.nextInt();

            if (x == 0) {
                maior = numb;
                menor = numb;
            }
            if (numb > maior) {
                maior = numb;
            }
            if (numb < menor) {
                menor = numb;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
