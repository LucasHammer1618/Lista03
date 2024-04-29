package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Vendedor;

public class Ex3 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Vendedor vendedor = new Vendedor();

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        vendedor.setNome(nomeVendedor);

        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        vendedor.setSalarioFixo(salarioFixo);

        System.out.println("Digite o total de vendas efetuadas (em dinheiro): ");
        double totalVendas = scanner.nextDouble();
        vendedor.setTotalVendas(totalVendas);

        double comissao = 0.15 * totalVendas;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("\nNome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário no final do mês: R$ " + salarioFinal);

        scanner.close();
    }
}
