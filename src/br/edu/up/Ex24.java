package br.edu.up;

import br.edu.up.modelos.CalculadoraNotaFinal;
import java.util.Scanner;

public class Ex24 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        CalculadoraNotaFinal calculadora = new CalculadoraNotaFinal();

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10): ");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = calculadora.calcularNotaFinal(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        System.out.println("A nota final do estudante é: " + notaFinal);

        scanner.close();
    }
}
