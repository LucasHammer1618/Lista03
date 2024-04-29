package br.edu.up;

import br.edu.up.modelos.AvaliadorIdade;

import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão avaliadas? ");
        int numeroPessoas = scanner.nextInt();

        AvaliadorIdade.avaliarIdades(numeroPessoas);

        scanner.close();
    }
}
