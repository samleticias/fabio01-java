package application;

import java.util.Locale;
import java.util.Scanner;

//Leia um número inteiro de segundos, calcule e escreva quantas horas, quantos minutos e quantos
//segundos ele corresponde.
public class Relogio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = (segundos % 3600) % 60;

        System.out.printf("Equivale a %d hora(s), %d minuto(s) e %d segundo(s).%n", horas, minutos, segundosRestantes);

        sc.close();
    }
}
