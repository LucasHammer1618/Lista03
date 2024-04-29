package br.edu.up.modelos;

import java.util.Scanner;
import br.edu.up.modelos.ContadorPessoas;

public class AvaliadorPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas a serem avaliadas: ");
        int totalPessoas = scanner.nextInt();

        ContadorPessoas contador = new ContadorPessoas(totalPessoas);

        contador.contarHomensEMulheres();

        scanner.close();
    }
}
