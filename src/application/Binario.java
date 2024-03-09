package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro (4 dígitos binários), calcule e escreva o equivalente na base decimal.
public class Binario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número na base binária: ");
        String numeroBinario = sc.next();

        if (numeroBinario.length() != 4) {
            System.out.println("Por favor, digite um número binário de 4 dígitos");
            sc.close();
            return;
        }

        int numeroDecimal = Integer.parseInt(numeroBinario, 2);

        System.out.printf("O equivalente na base decimal é: %d%n", numeroDecimal);

        sc.close();
    }
}
