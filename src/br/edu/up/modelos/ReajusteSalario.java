package br.edu.up.modelos;

public class ReajusteSalario {
    public static double calcularNovoSalario(double salario, double salarioMinimo) {
        double percentualAumento = 0.1; // 10% de aumento
        double novoSalarioMinimo = salarioMinimo * (1 + percentualAumento);
        return novoSalarioMinimo;
    }
}
