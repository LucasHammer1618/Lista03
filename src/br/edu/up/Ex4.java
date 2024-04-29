package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Cambio;

public class Ex4 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Cambio cambio = new Cambio();

        System.out.println("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();
        cambio.setCotacaoDolar(cotacaoDolar);

        System.out.println("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();
        cambio.setQuantidadeDolares(quantidadeDolares);

        double valorEmReais = cotacaoDolar * quantidadeDolares;

        System.out.println("Valor em reais (R$): " + valorEmReais);

        scanner.close();
    }
}
