package application;

import java.util.Locale;
import java.util.Scanner;

// Leia 3 números, calcule e escreva a média dos números.
public class MediaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite um número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite um número: ");
        int n3 = sc.nextInt();

        double media = (n1 + n2 + n3) / 3.0;

        System.out.printf("MÉDIA = %.2f%n", media);

        sc.close();

    }
}
