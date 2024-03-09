package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro de minutos, calcule e escreva quantos dias, quantas horas e quantos minutos ele
// corresponde.
public class Minutes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        final int minutosPorHora = 60;
        final int minutosPorDia = minutosPorHora * 24;

        int dias = minutos / minutosPorDia;
        int minutosRestantes = minutos % minutosPorDia;
        int horas = minutosRestantes / minutosPorHora;
        int minutosFinais = minutosRestantes % minutosPorHora;

        System.out.printf("Equivale a %d dia(s), %d hora(s) e %d minuto(s).%n", dias, horas, minutosFinais);

        sc.close();
    }
}
