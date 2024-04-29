package br.edu.up;

import java.util.Scanner;
import br.edu.up.modelos.RegistroAluno;

public class Ex8 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        RegistroAluno registroAluno = new RegistroAluno();

        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();
        registroAluno.setNome(nome);

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();
        registroAluno.setNota1(nota1);

        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();
        registroAluno.setNota2(nota2);

        System.out.println("Nota 3: ");
        double nota3 = scanner.nextDouble();
        registroAluno.setNota3(nota3);

        String mencao = registroAluno.calcularMencao();

        System.out.println("Nome do aluno: " + registroAluno.getNome());
        System.out.println("Menção: " + mencao);
        
        scanner.close();
    }
}
