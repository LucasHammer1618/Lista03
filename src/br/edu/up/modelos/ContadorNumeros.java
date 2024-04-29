package br.edu.up.modelos;

import java.util.Scanner;

public class ContadorNumeros {
    private int contador;

    public void contarNumerosNoIntervalo() {
        Scanner scanner = new Scanner(System.in);
        contador = 0;
        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        scanner.close();
    }

    public int getContador() {
        return contador;
    }
}
