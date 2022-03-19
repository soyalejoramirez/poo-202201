package com.taller.punto2.app;

import com.taller.punto2.dominio.Calculadora;
import com.taller.punto2.dominio.Snack;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class AppSnacks {
    public static void main(String[] args) {
        System.out.println(Calculadora.sumar(2, 4, 4));

        Snack snack = new Snack("Choclitos", (short) 3, 1200);
        Snack snack2 = new Snack("Coca Cola", (short) 6, 2000);
        Snack snack3 = new Snack("Chontaduro", (short) 6, 800);

        List<Snack> lista = Arrays.asList(snack, snack2, snack3);

        lista.forEach(s -> System.out.println(s.getCodigo() + " - " + s.getNombre()));
    }
}
