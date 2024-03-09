package application;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Coordenadas do ponto 1 (x1,y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Coordenadas do ponto 2 (x2,y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distância entre os pontos é: %.2f%n", distancia);

        sc.close();
    }
}
