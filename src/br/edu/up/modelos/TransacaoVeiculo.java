package br.edu.up.modelos;

public class TransacaoVeiculo {
    private double valorVeiculo;
    private double desconto;
    private double valorAPagar;

    public TransacaoVeiculo(double valorVeiculo, double desconto, double valorAPagar) {
        this.valorVeiculo = valorVeiculo;
        this.desconto = desconto;
        this.valorAPagar = valorAPagar;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
}
