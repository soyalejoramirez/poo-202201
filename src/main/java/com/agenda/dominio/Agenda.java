package com.agenda.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Agenda {
    public List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void agregar(String nombre, String apellido, long celular) {
        Contacto contactoAAgregar = new Contacto(nombre, apellido, celular);
        this.contactos.add(contactoAAgregar);
    }

    public void eliminar(Contacto contactoAEliminar) {
        boolean eliminoCorrectamente = this.contactos.remove(contactoAEliminar);

        if (eliminoCorrectamente) {
            System.out.println("Se eliminó el contacto " + contactoAEliminar.nombre);
        } else {
            System.out.println("No se eliminó nada. Porque el contacto " + contactoAEliminar.nombre + " no existe.");
        }
    }

    public void editar(Contacto contactoAEditar) {
        Contacto c = buscarConFilter(contactoAEditar.celular);

        if(c != null) {
            int posicionAReemplazar = this.contactos.indexOf(c);
            this.contactos.set(posicionAReemplazar, contactoAEditar);
        } else {
            System.out.println("El contacto a editar no existe.");
        }
    }

    public Contacto buscarConFilter(long celular) {
        Contacto contactoBuscado = this.contactos.stream()
                                    .filter(contacto -> contacto.celular == celular)
                                    .findFirst().orElse(null);
        return contactoBuscado;
    }

    public Contacto buscarConForEach(long celular) {
        AtomicReference<Contacto> contactoBuscado = new AtomicReference<>();

        this.contactos.forEach(contacto -> {
            if (contacto.celular == celular) {
                contactoBuscado.set(contacto);
            }
        });
        return contactoBuscado.get();
    }

    public void imprimirAgenda() {
        this.contactos.forEach(c -> System.out.println(c.nombre + " - " + c.celular));
    }

    public void imprimirAgendaOrdenada() {
    }
}
