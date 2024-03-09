package application;

import java.util.Locale;
import java.util.Scanner;

// Leia o valor do lado de um quadrado, calcule e escreva sua área. (área = lado2)
public class Quadrado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Medida do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = Math.pow(lado,2);

        System.out.printf("ÁREA DO QUADRADO = %.2f%n", area);

        sc.close();
    }
}
