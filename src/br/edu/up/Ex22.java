package br.edu.up;

import br.edu.up.modelos.CalculadoraContaLuz;
import java.util.Scanner;

public class Ex22 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipos de cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");

        System.out.println("Digite o tipo de cliente (1, 2 ou 3): ");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite o consumo de energia em KW/h: ");
        double consumoEnergia = scanner.nextDouble();

        double valorKWh = CalculadoraContaLuz.obterValorKWh(tipoCliente);
        if (valorKWh != -1) {
            double valorConta = consumoEnergia * valorKWh;
            System.out.println("O valor da conta de luz é: R$ " + valorConta);
        } else {
            System.out.println("Tipo de cliente inválido.");
        }

        scanner.close();
    }
}
