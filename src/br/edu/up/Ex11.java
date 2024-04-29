package br.edu.up;

import java.util.Scanner;

public class ContadorPessoas {
    private int totalPessoas;
    private int totalHomens;
    private int totalMulheres;

    public ContadorPessoas(int totalPessoas) {
        this.totalPessoas = totalPessoas;
    }

    public void contarHomensEMulheres() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido.");
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        scanner.close();
    }
}
