package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um valor em km, calcule e escreva o equivalente em m.
public class Medidas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor em Km: ");
        int valorKm = sc.nextInt();

        double valorMetros = valorKm * 1000;

        System.out.printf("VALOR EM METROS = %.2f%n", valorMetros);


        sc.close();
    }
}
