package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro de metros, calcule e escreva quantos Km e quantos metros ele corresponde.
public class Metros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor em metros: ");
        int valorMetros = sc.nextInt();

        double valorKm = valorMetros / 1000.0;
        int metrosRestantes = valorMetros % 1000;

        System.out.printf("Equivale a %.2f quilômetros e %d metros.%n", valorKm, metrosRestantes);

        sc.close();
    }
}

