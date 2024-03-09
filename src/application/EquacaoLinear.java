package application;

import java.util.Locale;
import java.util.Scanner;

// Escreva um algoritmo que leia os coeficientes a, b, c, d, e e f, calcule e escreva os valores de x e y.
public class EquacaoLinear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Coeficiente A: ");
        double a = sc.nextDouble();
        System.out.print("Coeficiente B: ");
        double b = sc.nextDouble();
        System.out.print("Coeficiente C: ");
        double c = sc.nextDouble();
        System.out.print("Coeficiente D: ");
        double d = sc.nextDouble();
        System.out.print("Coeficiente E: ");
        double e = sc.nextDouble();
        System.out.print("Coeficiente F: ");
        double f = sc.nextDouble();

        double x = (c * e - b * f) / (a * e - b * d);
        double y = (a * f - c * d) / (a * e - b * d);

        System.out.printf("X = %.2f%n", x);
        System.out.printf("Y = %.2f%n", y);

        sc.close();
    }
}
