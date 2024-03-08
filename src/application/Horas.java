package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um valor em horas e um valor em minutos, calcule e escreva o equivalente em minutos.
public class Horas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de horas: ");
        int horas = sc.nextInt();
        System.out.print("Digite a quantidade de minutos: ");
        int min = sc.nextInt();

        int minutos = horas * 60 + min;

        System.out.print("Corresponde a: " + minutos + " minutos");





        sc.close();
    }
}
