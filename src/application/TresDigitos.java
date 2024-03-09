package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro (3 dígitos) e escreva o inverso do número. (Ex.: número = 532 ; inverso = 235)
public class TresDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número inteiro de três dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            int inverso = unidade * 100 + dezena * 10 + centena;

            System.out.printf("INVERSO = %d%n", inverso);
        } else {
            System.out.println("Número inválido!");
        }



        sc.close();
    }
}
