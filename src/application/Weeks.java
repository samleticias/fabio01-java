package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um número inteiro de horas, calcule e escreva quantas semanas, quantos dias e quantas horas ele
//corresponde.
public class Weeks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de horas: ");
        int horas = sc.nextInt();

        final int horasPorDia = 24;
        final int horasPorSemana = horasPorDia * 7;

        int semanas = horas / horasPorSemana;
        int horasRestantes = horas % horasPorSemana;
        int dias = horasRestantes / horasPorDia;
        int horasFinais = horasRestantes % horasPorDia;

        System.out.printf("Equivale a %d semana(s), %d dia(s) e %d hora(s).%n", semanas, dias, horasFinais);

        sc.close();
    }
}
