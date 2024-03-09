package application;

import java.util.Locale;
import java.util.Scanner;
// Leia uma velocidade em km/h, calcule e escreva esta velocidade em m/s. (Vm/s = Vkm/h / 3.6)
public class Velocidade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a velocidade em Km/h: ");
        double velocidade_km = sc.nextDouble();

        double velocidade_ms = velocidade_km / 3.6;

        System.out.printf("A velocidade em m/s é: %.2f%n", velocidade_ms);



        sc.close();
    }
}
