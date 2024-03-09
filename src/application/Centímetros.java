package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um valor em m, calcule e escreva o equivalente em cm.
public class Centímetros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor em metros: ");
        int valorMetros = sc.nextInt();

        double valorCm = valorMetros * 100;

        System.out.printf("VALOR EM CENTÍMETROS = %.2f%n", valorCm);


        sc.close();
    }
}
