package application;

import java.util.Locale;
import java.util.Scanner;

// Leia a idade de uma pessoa expressa em anos, meses e dias e escreva-a expressa apenas em dias.
public class Idade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a idade em anos: ");
        int anos = sc.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = sc.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = sc.nextInt();


        int idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.printf("A idade expressa em dias é: %d dias%n", idadeEmDias);

        sc.close();
    }
}

