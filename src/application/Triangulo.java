package application;

import java.util.Locale;
import java.util.Scanner;

// Leia o valor da base e altura de um triângulo, calcule e escreva sua área. (área=(base * altura)/2)
public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Medida da base: ");
        double base = sc.nextDouble();
        System.out.print("Medida da altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("ÁREA DO TRIÂNGULO = %.2f%n", area);


        sc.close();
    }
}
