package br.edu.up;

import br.edu.up.modelos.Funcionario;

public class Ex16 {
    public static void executar() {
        int totalFuncionarios = 584;
        double salarioMinimo = 1100;

        double reajusteTotal = 0;

        for (int i = 1; i <= totalFuncionarios; i++) {
            Funcionario funcionario = new Funcionario(calcularSalarioAtual());

            double novoSalario = funcionario.calcularNovoSalario(salarioMinimo);
            double reajuste = funcionario.calcularReajuste(novoSalario);
            reajusteTotal += reajuste;
        }

        System.out.println("Total de reajuste para os 584 funcionários: R$ " + reajusteTotal);
    }

    public static double calcularSalarioAtual() {
        // Aqui você pode implementar a lógica para calcular o salário atual do funcionário.
        // Como não está definido no código original, deixei esse método retornando 0.
        return 0;
    }
}
