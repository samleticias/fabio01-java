package application;

import java.util.Locale;
import java.util.Scanner;

// Leia o salário de um trabalhador e escreva seu novo salário com um aumento de 25%.
public class Salario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor do salário R$: ");
        int salario = sc.nextInt();

        double novoSalario = salario + salario * 0.25;

        System.out.printf("NOVO SALÁRIO: R$ %.2f%n", novoSalario);


        sc.close();
    }
}
