package br.edu.up;

import br.edu.up.modelos.Trabalhador;
import java.util.Scanner;

public class Ex18 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do trabalhador: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do trabalhador: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo do trabalhador (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o salário fixo do trabalhador: ");
        double salarioFixo = scanner.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, idade, sexo, salarioFixo);

        double abono = trabalhador.calcularAbono();
        double salarioLiquido = trabalhador.calcularSalarioLiquido(abono);

        System.out.println("\nNome do trabalhador: " + nome);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
