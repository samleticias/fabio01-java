package application;
import java.util.Locale;
import java.util.Scanner;

// 1. Leia uma velocidade em m/s, calcule e escreva esta velocidade em km/h. (Vkm/h = Vm/s * 3.6)

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a velocidade em m/s: ");
        double velocidade_ms = sc.nextDouble();

        double velocidade_km = velocidade_ms * 3.6;

        System.out.printf("A velocidade em Km/h é: %.2f%n", velocidade_km);


        sc.close();
    }
}
