package application;

import java.util.Locale;
import java.util.Scanner;

// Leia uma temperatura em °F, calcule e escreva a equivalente em °C. (t°C = (5 * t°F - 160) / 9).
public class TemperaturaC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("TEMPERATURA EM FAHRENHEIT (ºF): ");
        double tf = sc.nextDouble();

        double tc = (5 * tf - 160) / 9;

        System.out.printf("TEMPERATURA EM CELSIUS (ºC): %.1f%n", tc);


        sc.close();
    }

}
