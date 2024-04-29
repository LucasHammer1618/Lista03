package br.edu.up.modelos;

public class CompraVeiculo {
    private double valorVeiculo;
    private int anoVeiculo;

    public CompraVeiculo(double valorVeiculo, int anoVeiculo) {
        this.valorVeiculo = valorVeiculo;
        this.anoVeiculo = anoVeiculo;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }
}
