package br.edu.up;

import br.edu.up.modelos.Item;

import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int produtos = 40;

        for (int i = 1; i <= produtos; i++) {
            System.out.println("Produto " + i + ":");
            System.out.print("Preço de custo: ");
            double precoCusto = scanner.nextDouble();

            System.out.print("Preço de venda: ");
            double precoVenda = scanner.nextDouble();

            Item item = new Item(precoCusto, precoVenda);
            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;

            System.out.println("Produto " + i + ": " + item.verificarLucroOuPrejuizo());
        }

        double mediaPrecoCusto = somaPrecoCusto / produtos;
        double mediaPrecoVenda = somaPrecoVenda / produtos;

        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

        scanner.close();
    }
}
