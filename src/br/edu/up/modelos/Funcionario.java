package br.edu.up.modelos;

public class Funcionario {
    private double salarioAtual;

    public Funcionario(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double calcularNovoSalario(double salarioMinimo) {
        double novoSalario;

        if (salarioAtual < 3 * salarioMinimo) {
            novoSalario = salarioAtual * 1.5;
        } else if (salarioAtual <= 10 * salarioMinimo) {
            novoSalario = salarioAtual * 1.2;
        } else if (salarioAtual <= 20 * salarioMinimo) {
            novoSalario = salarioAtual * 1.15;
        } else {
            novoSalario = salarioAtual * 1.1;
        }

        return novoSalario;
    }

    public double calcularReajuste(double novoSalario) {
        return novoSalario - salarioAtual;
    }
}
