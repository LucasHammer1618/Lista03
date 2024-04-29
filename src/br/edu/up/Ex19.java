package br.edu.up;

import br.edu.up.modelos.ReajusteSalario;
import java.util.Scanner;

public class Ex19 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        double novoSalario = ReajusteSalario.calcularNovoSalario(salario, salarioMinimo);
        double aumentoFolha = novoSalario - salario;

        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Reajuste: R$ " + aumentoFolha);
        System.out.println("Novo salário: R$ " + novoSalario);
        System.out.println("Aumento na folha de pagamento: R$ " + aumentoFolha);

        scanner.close();
    }
}
