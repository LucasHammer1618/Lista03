package br.edu.up;

import br.edu.up.modelos.ClassificadorNadador;
import java.util.Scanner;

public class Ex21 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        String categoria = ClassificadorNadador.classificarNadador(idade);

        if (!categoria.equalsIgnoreCase("Fora da faixa etária")) {
            System.out.println("O nadador está na categoria " + categoria);
        } else {
            System.out.println("Idade fora da faixa etária");
        }

        scanner.close();
    }
}
