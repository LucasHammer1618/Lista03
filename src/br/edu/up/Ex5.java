package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Compra;

public class Ex5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Compra compra = new Compra();

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        compra.setValorCompra(valorCompra);

        double valorPrestacao = valorCompra / 5;

        System.out.println("Valor de cada prestação (sem juros): " + valorPrestacao);

        scanner.close();
    }
}
