package application;

import java.util.Locale;
import java.util.Scanner;
//Calcule a quantidade de dinheiro gasta por um fumante. Dados de entrada: o número de anos que ele
//fuma, o no de cigarros fumados por dia e o preço de uma carteira (1 carteira tem 20 cigarros).
public class Cigarros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Há quantos anos você fuma? ");
        int anosFumando = sc.nextInt();
        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosPorDia = sc.nextInt();
        System.out.print("Quanto custa uma carteira de cigarros? ");
        double precoCarteira = sc.nextDouble();

        double despesaTotal = (cigarrosPorDia * anosFumando * 365) / 20.0 * precoCarteira;

        System.out.printf("A quantia total gasta em cigarros é: R$ %.2f%n", despesaTotal);

        sc.close();
    }
}

