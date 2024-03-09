package application;

import java.util.Locale;
import java.util.Scanner;

// Leia o valor do raio de uma esfera, calcule e escreva seu volume. (v = (4 * p * r3) / 3)
public class Esfera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Medida do raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = (4 * Math.PI * Math.pow(raio,3) ) / 3;

        System.out.printf("VOLUME DA ESFERA = %.2f%n", volume);

        sc.close();
    }
}
