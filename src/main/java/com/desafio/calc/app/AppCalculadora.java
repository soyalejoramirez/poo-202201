package com.desafio.calc.app;

import com.desafio.calc.dominio.Calculadora;
import com.parcial.app.AppEPS;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {
    public static final String TITULO = "Calculadora";
    public static final ImageIcon ICONO = new ImageIcon(AppEPS.class.getResource("/imagenes/uco.png"));
    public static final JCheckBox J_CHECK_BOX = new JCheckBox("Redondear");
    public static final Object[] OPCIONES = Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", J_CHECK_BOX).toArray();

    public static final int CERRAR = -1;
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingesa tu nombre");

        while (true) {
            int opcionElegida = JOptionPane.showOptionDialog(null, "¿Qué operación deseas realizar?",
                    TITULO, 0, 0, ICONO, OPCIONES, "Multiplicar");

            if (opcionElegida == CERRAR) {
                System.exit(0);
            }

            List<Integer> numerosAOperar = new ArrayList<>();
            int nro1 = 0;
            int nro2 = 0;
            double resultado = 0;
            boolean pudoCastear;

            do {
                try {
                    nro1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                    pudoCastear = true;
                    numerosAOperar.add(nro1);
                } catch (NumberFormatException e) {
                    pudoCastear = false;
                }
            } while (pudoCastear == false);

            do {
                try {
                    nro2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                    pudoCastear = true;
                } catch (NumberFormatException e) {
                    pudoCastear = false;
                }
            } while (pudoCastear == false || nro2 == 0);

            switch (opcionElegida) {
                case SUMAR: {
                    resultado = Calculadora.sumar(Arrays.asList(nro1, nro2));
                    break;
                }
                case RESTAR: {
                    resultado = Calculadora.restar(Arrays.asList(nro1, nro2));
                    break;
                }
                case MULTIPLICAR: {
                    resultado = Calculadora.multiplicar(nro1, nro2);
                    break;
                }
                case DIVIDIR: {
                    resultado = Calculadora.dividir(nro1, nro2, J_CHECK_BOX.isSelected());
                    System.out.println(resultado);
                    break;
                }
            }

            mostrarMensaje("Hola " + nombre + ", el resultado es " + resultado);
        }
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, TITULO, 0, ICONO);
    }
}
