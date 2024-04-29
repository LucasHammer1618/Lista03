package br.edu.up;

import br.edu.up.modelos.CalculadoraNotas;
import java.util.Scanner;

public class Ex25 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        CalculadoraNotas calculadora = new CalculadoraNotas();

        System.out.println("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de matrícula do estudante: ");
        int matricula = scanner.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10): ");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = calculadora.calcularNotaFinal(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        String classificacao = calculadora.classificarEstudante(notaFinal);

        System.out.println("\nNome do estudante: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
