package application;

import java.util.Locale;
import java.util.Scanner;

// Leia 2 números, calcule e escreva a divisão da soma pela subtração dos números lidos.
public class Divisão {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite um número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int divisao = soma / subtracao;

        System.out.print("SOMA = " + soma + "\n" + "SUBTRAÇÃO = " + subtracao + "\n" + "RESULTADO DA DIVISÃO = " + divisao);

        sc.close();

    }
}
