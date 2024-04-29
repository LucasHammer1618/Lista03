package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Produto;

public class Ex6 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();
        produto.setPrecoCusto(precoCusto);

        System.out.println("Digite o percentual de acréscimo (em %): ");
        double percentualAcrescimo = scanner.nextDouble();
        produto.setPercentualAcrescimo(percentualAcrescimo);

        double acrescimo = precoCusto * (percentualAcrescimo / 100);
        double precoVenda = precoCusto + acrescimo;

        System.out.println("O valor de venda do produto é: R$ " + precoVenda);

        scanner.close();
    }
}
