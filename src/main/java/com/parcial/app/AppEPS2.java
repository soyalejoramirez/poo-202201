package com.parcial.app;

import javax.swing.*;
import java.util.Arrays;

public class AppEPS2 {
    public static ImageIcon icono = new ImageIcon(AppEPS.class.getResource("/imagenes/uco.png"));

    public static void main(String[] args) {
        while (true) {
            int opcionElegida = JOptionPane.showOptionDialog(null, "Que quieres hacer?", "POO",
                    0, 0, icono, Arrays.asList("Afiliar", "Retirar", "Consultar").toArray(),
                    "Afiliar");

            mostrarMensaje("la selección fue: " + opcionElegida);

//            int opcion = JOptionPane.showConfirmDialog(null, "Quieres continuar?", "POO",
//                    JOptionPane.OK_CANCEL_OPTION);
//
//            if (opcion == JOptionPane.CLOSED_OPTION) {
//                break;
//            } else if (opcion == JOptionPane.YES_OPTION) {
//                mostrarMensaje("SIIIII");
//            } else if (opcion == JOptionPane.NO_OPTION) {
//                mostrarMensaje("NOOOO");
//            } else if (opcion == JOptionPane.CANCEL_OPTION) {
//                mostrarMensaje("CANCELÓ");
//            }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.QUESTION_MESSAGE, icono);
    }
}
