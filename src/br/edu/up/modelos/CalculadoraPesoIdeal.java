package br.edu.up.modelos;

public class CalculadoraPesoIdeal {
    public static double calcularPesoIdeal(char sexo, double altura, int idade) {
        double pesoIdeal;

        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = 72.7 * altura - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = 72.7 * altura - 53;
                } else {
                    pesoIdeal = 72.7 * altura - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = 72.7 * altura - 50;
                } else {
                    pesoIdeal = 72.7 * altura - 58;
                }
            }
        } else { // Sexo 'F'
            if (altura > 1.50) {
                if (idade >= 35) {
                    pesoIdeal = 62.1 * altura - 45;
                } else {
                    pesoIdeal = 62.1 * altura - 49;
                }
            } else {
                if (idade >= 35) {
                    pesoIdeal = 62.1 * altura - 44.7;
                } else {
                    pesoIdeal = 62.1 * altura - 44;
                }
            }
        }

        return pesoIdeal;
    }
}
