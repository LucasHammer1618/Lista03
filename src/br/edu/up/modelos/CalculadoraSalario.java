package br.edu.up.modelos;

public class CalculadoraSalario {
    public static double calcularSalario(int horasAula, int nivel) {
        double valorHoraAula;

        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido.");
                return 0.0; // Retorna 0 se o nível for inválido
        }

        return valorHoraAula * horasAula;
    }
}
