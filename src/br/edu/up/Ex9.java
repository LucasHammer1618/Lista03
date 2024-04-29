package br.edu.up;

import br.edu.up.modelos.ContadorNumeros;

public class Ex9 {
    public static void executar() {
        ContadorNumeros contadorNumeros = new ContadorNumeros();
        contadorNumeros.contarNumerosNoIntervalo();
        int contador = contadorNumeros.getContador();
        System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);
    }
}
