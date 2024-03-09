package application;

import java.util.Locale;
import java.util.Scanner;

// Leia 2 números inteiros, calcule e escreva o quociente e o resto da divisão do 1o pelo 2o.
public class Quociente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite um número: ");
        int n2 = sc.nextInt();

        int quociente = n1 / n2;
        int resto = n1 % n2;

        System.out.print("QUOCIENTE = " + quociente + "\n" + "RESTO DA DIVISÃO = " + resto);

        sc.close();
    }
}
