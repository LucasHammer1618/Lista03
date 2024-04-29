package br.edu.up;

import br.edu.up.modelos.CompraVeiculo;

import java.util.Scanner;

public class Ex12 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        String continuar;

        do {
            System.out.println("Digite o ano do veículo: ");
            int ano = scanner.nextInt();

            System.out.println("Digite o valor do veículo: ");
            double valorVeiculo = scanner.nextDouble();

            CompraVeiculo compraVeiculo = new CompraVeiculo(valorVeiculo, ano);

            double desconto;
            if (compraVeiculo.getAnoVeiculo() <= 2000) {
                desconto = compraVeiculo.getValorVeiculo() * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = compraVeiculo.getValorVeiculo() * 0.07;
            }

            double valorAPagar = compraVeiculo.getValorVeiculo() - desconto;

            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor a ser pago: R$ " + valorAPagar);

            totalGeral++;

            System.out.println("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Total de veículos com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de veículos: " + totalGeral);

        scanner.close();
    }
}
