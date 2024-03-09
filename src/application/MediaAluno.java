package application;

import java.util.Locale;
import java.util.Scanner;

//Leia 3 notas de um aluno e o peso de cada nota, calcule e escreva a média ponderada.
public class MediaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("NOTA 1: ");
        double n1 = sc.nextDouble();
        System.out.print("PESO 1: ");
        int p1 = sc.nextInt();

        System.out.print("NOTA 2: ");
        double n2 = sc.nextDouble();
        System.out.print("PESO 2: ");
        int p2 = sc.nextInt();

        System.out.print("NOTA 3: ");
        double n3 = sc.nextDouble();
        System.out.print("PESO 3: ");
        int p3 = sc.nextInt();

        double media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

        System.out.printf("MÉDIA PONDERADA = %.2f%n", media);



        sc.close();
    }
}
