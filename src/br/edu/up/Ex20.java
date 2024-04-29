package br.edu.up;

import br.edu.up.modelos.CalculadoraSalario;
import java.util.Scanner;

public class Ex20 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas/aula ministradas: ");
        int horasAula = scanner.nextInt();

        System.out.println("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();

        double salario = CalculadoraSalario.calcularSalario(horasAula, nivel);
        System.out.println("O salário do professor é: R$ " + salario);

        scanner.close();
    }
}
