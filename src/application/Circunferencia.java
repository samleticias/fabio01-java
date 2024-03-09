package application;

import java.util.Locale;
import java.util.Scanner;

// Leia o valor do raio de uma circunferência, calcule e escreva seu comprimento.(c = 2 * p * r)
public class Circunferencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Medida do raio da circunferência: ");
        double raio = sc.nextDouble();

        double comprimento = 2 * Math.PI * raio;

        System.out.printf("COMPRIMENTO DA CIRCUNFERÊNCIA = %.2f%n", comprimento);

        sc.close();
    }
}
