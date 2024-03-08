package application;

import java.util.Locale;
import java.util.Scanner;

// Leia o valor do dólar e um valor em dólar, calcule e escreva o equivalente em real (R$).
public class Dólar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double dolar = 4.95;

        System.out.print("Digite um valor em dólares: ");
        int dolares = sc.nextInt();

        double real = dolar * dolares;
        System.out.print("Corresponde a : R$ " + real);


        sc.close();
    }
}
