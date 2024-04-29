package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Automovel;

public class Ex2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Automovel automovel = new Automovel();

        System.out.println("Digite a distância total percorrida (em km): ");
        double distanciaTotal = scanner.nextDouble();
        automovel.setDistanciaTotalPercorrida(distanciaTotal);

        System.out.println("Digite o total de combustível gasto (em litros): ");
        double combustivelGasto = scanner.nextDouble();
        automovel.setCombustivelGasto(combustivelGasto);

        double consumoMedio = distanciaTotal / combustivelGasto;

        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");

        scanner.close();
    }
}
