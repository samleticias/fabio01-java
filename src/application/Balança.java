package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um valor em kg (quilograma), calcule e escreva o equivalente em g (grama).
public class Balança {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor em Kg: ");
        int valorKg = sc.nextInt();

        double valorGramas = valorKg * 1000;

        System.out.printf("VALOR EM GRAMAS = %.2f%n", valorGramas);

        sc.close();
    }
}
