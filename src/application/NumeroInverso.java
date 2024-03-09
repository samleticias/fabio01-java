package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro (3 dígitos), calcule e escreva a diferença entre o número e seu inverso.
public class NumeroInverso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Digite um número de três dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            int inverso = unidade * 100 + dezena * 10 + centena;

            int diferenca = numero - inverso;

            System.out.printf("NÚMERO = %d%n", numero);
            System.out.printf("INVERSO = %d%n", inverso);
            System.out.printf("DIFERENÇA = %d - %d = %d", numero, inverso, diferenca);

        } else {
            System.out.println("Número inválido!");
        }

        sc.close();
    }
}
