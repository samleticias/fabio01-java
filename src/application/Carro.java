package application;

import java.util.Locale;
import java.util.Scanner;

//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor
//seja de 28% e os impostos de 45%, escreva um algoritmo que leia o custo de fábrica de um carro e
//escreva o custo ao consumidor.
public class Carro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = sc.nextDouble();

        double percentagemDistribuidor = custoFabrica * 0.28;
        double percentagemImpostos = custoFabrica * 0.45;

        double custoTotal = custoFabrica + percentagemDistribuidor + percentagemImpostos;

        System.out.printf("CUSTO DE FÁBRICA = R$ %.2f%n", custoFabrica);
        System.out.printf("CUSTO DISTRIBUIDOR = R$ %.2f%n", percentagemDistribuidor);
        System.out.printf("CUSTO IMPOSTOS = R$ %.2f%n", percentagemImpostos);
        System.out.printf("CUSTO TOTAL = R$ %.2f%n", custoTotal);

        sc.close();
    }
}
