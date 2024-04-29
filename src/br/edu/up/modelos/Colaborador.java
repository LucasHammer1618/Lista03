package br.edu.up.modelos;

public class Colaborador {
    private String nome;
    private double salario;

    public Colaborador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularReajuste(double salarioMinimo) {
        double percentual = 0.1; // 10% de reajuste
        double novoSalarioMinimo = salarioMinimo * (1 + percentual);
        return novoSalarioMinimo - salario;
    }

    public double calcularNovoSalario(double reajuste) {
        return salario + reajuste;
    }
}
