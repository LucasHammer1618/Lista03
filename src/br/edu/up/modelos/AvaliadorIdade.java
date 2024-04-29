package br.edu.up.modelos;

import java.util.Scanner;

public class AvaliadorIdade {
    public static void avaliarIdades(int numeroPessoas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }

        scanner.close();
    }
}
