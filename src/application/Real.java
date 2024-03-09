package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um valor em real (R$), calcule e escreva 70% deste valor.
public class Real {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("VALOR EM REAIS: R$ ");
        double valor = sc.nextDouble();

        double percentil = valor * 0.7;

        System.out.printf("70%% DO VALOR: R$ %.2f%n", percentil);

        sc.close();
    }
}
