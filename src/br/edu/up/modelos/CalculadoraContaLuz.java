package br.edu.up.modelos;

public class CalculadoraContaLuz {
    public static double obterValorKWh(int tipoCliente) {
        switch (tipoCliente) {
            case 1:
                return 0.602;
            case 2:
                return 0.483;
            case 3:
                return 1.29;
            default:
                return -1;
        }
    }
}
