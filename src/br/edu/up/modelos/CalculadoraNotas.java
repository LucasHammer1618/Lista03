package br.edu.up.modelos;

public class CalculadoraNotas {
    public double calcularNotaFinal(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;

        return (notaLaboratorio * pesoLaboratorio + notaAvaliacaoSemestral * pesoAvaliacaoSemestral
                + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);
    }

    public String classificarEstudante(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }
}
