package application;

import java.util.Locale;
import java.util.Scanner;

// Leia a idade de uma pessoa expressa em dias e escreva-a expressa em anos, meses e dias.
public class IdadeDias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a idade em dias: ");
        int dias = sc.nextInt();

        int anos = dias / 365;
        int meses = (dias % 365) / 30;
        int diasRestantes = (dias % 365) % 30;

        System.out.printf("A idade expressa em anos, meses e dias é: %d anos, %d meses e %d dias%n", anos, meses, diasRestantes);

        sc.close();
    }
}
