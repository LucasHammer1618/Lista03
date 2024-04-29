package br.edu.up.modelos;

public class CalculadoraNotaFinal {
    public double calcularNotaFinal(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;

        return (notaLaboratorio * pesoLaboratorio + notaAvaliacaoSemestral * pesoAvaliacaoSemestral
                + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);
    }
}
