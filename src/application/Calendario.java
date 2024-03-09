package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro de dias, calcule e escreva quantas semanas e quantos dias ele corresponde.
public class Calendario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de dias: ");
        int dias = sc.nextInt();

        int semanas = dias / 7;
        int diasRestantes = dias % 7;

        System.out.printf("Equivale a %d semanas e %d dias.%n", semanas, diasRestantes);

        sc.close();
    }
}
