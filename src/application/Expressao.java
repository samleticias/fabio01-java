package application;

import java.util.Locale;
import java.util.Scanner;

public class Expressao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número: ");
        int A = sc.nextInt();
        System.out.print("Digite um número: ");
        int B = sc.nextInt();
        System.out.print("Digite um número: ");
        int C = sc.nextInt();

        double R = Math.pow((A + B),2);
        double S = Math.pow((B + C),2);

        double D = (R + S) / 2;

        System.out.printf("R = %.2f%n", R);
        System.out.printf("S = %.2f%n", S);
        System.out.printf("D = %.2f%n", D);



        sc.close();
    }
}
