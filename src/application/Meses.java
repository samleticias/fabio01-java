package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro de meses, calcule e escreva quantos anos e quantos meses ele corresponde.
public class Meses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();

        int anos = meses / 12;
        int mesesRestantes = meses % 12;

        System.out.printf("Equivale a %d ano(s) e %d mes(es).%n", anos, mesesRestantes);

        sc.close();
    }
}
