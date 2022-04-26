package com.vehiculo.app;

import com.vehiculo.dominio.Bicicleta;
import com.vehiculo.dominio.Vehiculo;

public class VehiculosApp {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Vehiculo bici2 = new Bicicleta();

        long edad = 30;

        bicicleta.setCadencia(50.4);
        ((Bicicleta) bici2).setCadencia(10.2);

        System.out.println("Bicicleta " + bicicleta.getCadencia());
        System.out.println("Bici2 " + ((Bicicleta) bici2).getCadencia());
    }
}
