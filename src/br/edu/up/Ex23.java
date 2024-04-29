package br.edu.up;

import br.edu.up.modelos.CalculadoraPesoIdeal;
import java.util.Scanner;

public class Ex23 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        double pesoIdeal = CalculadoraPesoIdeal.calcularPesoIdeal(sexo, altura, idade);
        System.out.println("O peso ideal de " + nome + " é: " + pesoIdeal + " kg");

        scanner.close();
    }
}
