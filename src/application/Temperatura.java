package application;

import java.util.Locale;
import java.util.Scanner;

// Leia uma temperatura em °C, calcule e escreva a equivalente em °F. (t°F = (9 * t°C + 160) / 5)
public class Temperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("TEMPERATURA EM CELSIUS (ºC): ");
        double tc = sc.nextDouble();

        double tf = (9 * tc + 160) / 5;

        System.out.printf("TEMPERATURA EM FAHRENHEIT (ºF): %.1f%n", tf);



        sc.close();
    }
}
