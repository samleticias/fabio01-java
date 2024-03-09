package application;
import java.util.Scanner;
// Um algoritmo para gerenciar os saques de um caixa eletrônico deve possuir algum mecanismo para
//decidir o numero de notas de cada valor que deve ser disponibilizado para o cliente que realizou o
//saque. Um possível critério seria o da "distribuição ótima" no sentido de que as notas de menor valor
//disponíveis fossem distribuídas em número mínimo possível. Por exemplo, se a maquina só dispõe de
//notas de R$ 50, de R$ 10, de R$ 5 e de R$ 1, para uma quantia solicitada de R$ 87, o algoritmo deveria
//indicar uma nota de R$ 50, três notas de R$ 10, uma nota de R$ 5 e duas notas de R$ 1. Escreva um
//algoritmo que receba o valor da quantia solicitada e retorne a distribuição das notas de acordo com o
//critério da distribuição ótima.
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor Saque R$: ");
        double valorSaque = sc.nextDouble();

        int notas50 = (int) (valorSaque / 50);
        int notas10 = (int) ((valorSaque % 50) / 10);
        int notas5 = (int) (((valorSaque % 50) % 10) / 5);
        int notas1 = (int) (((valorSaque % 50) % 10) % 5);


        System.out.println("Distribuição ótima das notas:");
        System.out.println("Notas de R$ 50: " + notas50);
        System.out.println("Notas de R$ 10: " + notas10);
        System.out.println("Notas de R$ 5: " + notas5);
        System.out.println("Notas de R$ 1: " + notas1);

        sc.close();
    }
}
