package br.edu.up;

import java.util.Scanner;
import br.edu.up.modelos.Carro;

public class Ex7 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.println("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        carro.setCustoFabrica(custoFabrica);

        double custoConsumidor = carro.calcularCustoConsumidor();

        System.out.println("O custo ao consumidor do carro é: R$ " + custoConsumidor);

        scanner.close();
    }
}
