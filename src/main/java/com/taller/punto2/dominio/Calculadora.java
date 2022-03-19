package com.taller.punto2.dominio;

import java.util.Arrays;

public class Calculadora {
    public static int sumar(int... numeros) {
        return Arrays.stream(numeros).sum();
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static long sumar(int nro1, int nro2, int nro3) {
        return nro1 + nro2 + nro3;
    }
}
