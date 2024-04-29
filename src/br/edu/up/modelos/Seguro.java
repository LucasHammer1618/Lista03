package br.edu.up.modelos;

public class Seguro {
    public static int determinarCategoria(int idade, int grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            return grupoRisco;
        } else if (idade >= 21 && idade <= 24) {
            return grupoRisco + 1;
        } else if (idade >= 25 && idade <= 34) {
            return grupoRisco + 2;
        } else if (idade >= 35 && idade <= 64) {
            return grupoRisco + 3;
        } else if (idade >= 65 && idade <= 70) {
            return grupoRisco + 6;
        } else {
            return -1;
        }
    }
}
