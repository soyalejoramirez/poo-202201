package com.taller.punto1.app;

import com.parcial.dominio.EPS;
import com.parcial.dominio.Enfermedad;
import com.parcial.dominio.Paciente;

import java.util.Arrays;

public class AppEPS {
    public static void main(String[] args) {
        EPS eps = new EPS();

        eps.afiliarPaciente(123, "Alejandro");
        eps.afiliarPaciente(456, "David");
        eps.afiliarPaciente(789, "Susana");
        eps.afiliarPaciente(101, "Camila");

        Paciente david = eps.buscarPaciente(456);
        david.setEnfermedades(Arrays.asList(new Enfermedad("covid"), new Enfermedad("pie de atleta"), new Enfermedad("dermatitis")));

        Paciente camila = eps.buscarPaciente(101);
        camila.setEnfermedades(Arrays.asList(new Enfermedad("tubercolosis"), new Enfermedad("covid")));

        //eps.ordenarPacientesPorNombre();

        eps.buscarPacientesPorEnfermedad("pie de atleta").forEach(p -> System.out.println(p.getNombre()));
    }
}
