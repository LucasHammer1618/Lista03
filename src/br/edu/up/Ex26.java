package br.edu.up;

import br.edu.up.modelos.Seguro;
import java.util.Scanner;

public class Ex26 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        if (idade >= 17 && idade <= 70) {
            System.out.println("Digite o grupo de risco (Baixo = 1, Médio = 2, Alto = 3): ");
            int grupoRisco = scanner.nextInt();

            int categoria = Seguro.determinarCategoria(idade, grupoRisco);

            if (categoria != -1) {
                System.out.println("\nDados do pretendente:");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Grupo de risco: " + grupoRisco);
                System.out.println("Categoria de seguro: " + categoria);
            } else {
                System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
            }
        } else {
            System.out.println("O pretendente não se enquadra na faixa etária necessária.");
        }

        scanner.close();
    }
}
