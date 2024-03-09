package application;

import java.util.Locale;
import java.util.Scanner;

// Leia 2 números (A, B) e escreva-os em ordem inversa (B, A).
public class OrdemInversa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número: ");
        int A = sc.nextInt();
        System.out.print("Digite um número: ");
        int B = sc.nextInt();

        System.out.print(" " + A  + ", " + B + " " + "\n" + "ORDEM INVERSA = (" + B + ", " + A + ")");


        sc.close();
    }
}
