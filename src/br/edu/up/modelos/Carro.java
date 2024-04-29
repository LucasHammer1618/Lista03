package br.edu.up.modelos;

public class Carro {
    private double custoFabrica;
    private double percentualImpostos = 0.45;
    private double percentualDistribuidor = 0.28;

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double valorImpostos = custoFabrica * percentualImpostos;
        double valorDistribuidor = (custoFabrica + valorImpostos) * percentualDistribuidor;
        return custoFabrica + valorImpostos + valorDistribuidor;
    }
}
