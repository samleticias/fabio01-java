package application;

import java.util.Locale;
import java.util.Scanner;

public class Fracao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a primeira fração (numerador e denominador separados por espaço): ");
        int numerador1 = sc.nextInt();
        int denominador1 = sc.nextInt();

        System.out.println("Digite a segunda fração (numerador e denominador separados por espaço): ");
        int numerador2 = sc.nextInt();
        int denominador2 = sc.nextInt();

        int novoDenominador = denominador1 * denominador2;
        int novoNumerador = numerador1 * denominador2 + numerador2 * denominador1;

        System.out.printf("A soma das frações é: %d/%d%n", novoNumerador, novoDenominador);

        sc.close();
    }
}

