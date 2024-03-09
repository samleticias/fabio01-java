package application;
import java.util.Scanner;
// Uma loja vende seus produtos no sistema entrada mais duas prestações, sendo a entrada maior ou igual a
//cada uma das duas prestações; estas devem ser iguais, inteiras e as maiores possíveis. Por exemplo, se o
//valor da mercadoria for R$ 270,00, a entrada e as duas prestações são iguais a R$ 90,00; se o valor da
//mercadoria for R$ 302,00, a entrada é de R$ 102,00 e as duas prestações são iguais a R$ 100,00.
//Escreva um algoritmo que receba o valor da mercadoria e forneça o valor da entrada e das duas
//prestações, de acordo com as regras acima.

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da mercadoria R$: ");
        double valorMercadoria = sc.nextDouble();

        double entrada = valorMercadoria / 3;

        entrada = Math.ceil(entrada);

        double prestacao = (valorMercadoria - entrada) / 2;

        System.out.printf("Valor da entrada: R$ %.2f%n", entrada);
        System.out.printf("Valor das duas prestações iguais: R$ %.2f%n", prestacao);

        sc.close();
    }
}

