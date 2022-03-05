package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregar("Georgina", "Ronaldo", 3113776458l);
        agenda.agregar("Ana", "Bedoya", 3219000174l);
        agenda.agregar("Carlos", "Mattos", 3002587496l);
        agenda.agregar("Alejandro", "Ramirez", 3104698710l);

        agenda.imprimirAgenda();
        Contacto c = agenda.buscarConFilter(3104698710l);

        if (c != null) {
            System.out.println("Contacto buscado: " + c.nombre);
        } else {
            System.out.println("Contacto no encontrado");
        }

        Contacto contactoExistente = new Contacto("Alfredo", "Berrio", 3104698710l);
        agenda.editar(contactoExistente);

        agenda.imprimirAgenda();
    }
}
