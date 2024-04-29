package br.edu.up;


import java.util.Scanner;

import br.edu.up.modelos.Aluno;

public class Ex1 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        aluno.setNome(nome);

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();
        aluno.setNota1(nota1);

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();
        aluno.setNota2(nota2);

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = scanner.nextDouble();
        aluno.setNota3(nota3);

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
