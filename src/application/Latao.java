package application;

import java.util.Locale;
import java.util.Scanner;

// Sabendo que latão é constituído de 70% de cobre e 30% de zinco, escreva um algoritmo que calcule a
//quantidade de cada um desses componentes para se obter certa quantidade de latão (em kg), informada
//pelo usuário.
public class Latao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o peso do latão em Kg: ");
        double lataoKg = sc.nextDouble();

        double quantidadeCobre = lataoKg * 0.7;
        double quantidadeZinco = lataoKg * 0.3;


        System.out.printf("LATÃO (KG) = %.2f%n", lataoKg);
        System.out.printf("QUANTIDADE ZINCO (KG) = %.2f%n", quantidadeZinco);
        System.out.printf("QUANTIDADE COBRE (KG) = %.2f%n", quantidadeCobre);

        sc.close();
    }
}
