package com.desafio.calc.dominio;

import java.util.Arrays;
import java.util.List;

public class Calculadora {
    public static int sumar(List<Integer> nros) {
        return nros.stream().mapToInt(nro -> nro).sum();
    }

    public static int restar(List<Integer> nros) {
        int resultado = 0;

        for (int i = 0; i < nros.size(); i++) {
            resultado -= nros.get(i);
        }

        //return nros.stream().mapToInt(nro -> nro).reduce((left, right) -> left - right).getAsInt();
        return resultado;
    }

    public static int multiplicar(int nro1, int nro2) {
        return nro1 * nro2;
    }

    public static double dividir(double nro1, double nro2, boolean redondear) {
        if (redondear) {
            return Math.round(nro1 / nro2);
        }

        return nro1 / nro2;
    }
}
