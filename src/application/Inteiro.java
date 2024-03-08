package application;

import java.util.Locale;
import java.util.Scanner;
// Leia um número inteiro (3 dígitos), calcule e escreva a soma de seus elementos (C + D + U).
public class Inteiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número de 3 dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            int soma = centena + dezena + unidade;

            System.out.printf("A soma dos elementos é: %d%n", soma);
        } else {
            System.out.println("Digite um número de 3 dígitos");
        }

        sc.close();
    }
}
