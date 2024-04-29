package br.edu.up;

import br.edu.up.modelos.Colaborador;
import java.util.Scanner;

public class Ex17 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do colaborador: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        Colaborador colaborador = new Colaborador(nome, salario);

        double reajuste = colaborador.calcularReajuste(salarioMinimo);
        double novoSalario = colaborador.calcularNovoSalario(reajuste);

        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Reajuste: R$ " + reajuste);
        System.out.println("Novo salário: R$ " + novoSalario);

        double aumentoFolha = reajuste;
        System.out.println("\nAumento na folha de pagamento: R$ " + aumentoFolha);

        scanner.close();
    }
}
