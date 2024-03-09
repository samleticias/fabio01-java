package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro (4 dígitos), calcule e escreva a soma dos elementos que o compõem. Ex.:
// número = 9534 ; soma = 9+5+3+4 = 21.
public class SomaDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número de 4 dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 1000 && numero <= 9999) {
            int milhar = numero / 1000;
            int centena = (numero % 1000) / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            int soma = milhar + centena + dezena + unidade;

            System.out.printf("A soma dos elementos é: %d%n", soma);
        } else {
            System.out.println("Digite um número de 4 dígitos");
        }

        sc.close();
    }
}
