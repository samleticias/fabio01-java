package application;

import java.util.Locale;
import java.util.Scanner;

// Leia 3 números, calcule e escreva a soma dos 2 primeiros e a diferença entre os 2 últimos.
public class Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite um número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite um número: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2;
        int diferenca = n2 - n3;

        System.out.print("SOMA = " + soma + "\n" + "DIFERENÇA = " + diferenca);


        sc.close();
    }
}
