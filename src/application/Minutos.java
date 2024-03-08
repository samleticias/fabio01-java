package application;

import java.util.Locale;
import java.util.Scanner;

// Leia um valor em minutos, calcule e escreva o equivalente em horas e minutos.
public class Minutos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        int horas = minutos / 60;
        int resto = minutos % 60;

        System.out.print("Corresponde a " + horas + " horas e " + resto + " minutos. ");



        sc.close();
    }
}
