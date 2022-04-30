package com.vehiculo.app;

import com.vehiculo.dominio.Bicicleta;
import com.vehiculo.dominio.Carro;
import com.vehiculo.dominio.Moto;
import com.vehiculo.dominio.Taxi;
import com.vehiculo.dominio.Vehiculo;

import java.util.Arrays;
import java.util.List;

public class VehiculosApp {
    public static void main(String[] args) {
        Bicicleta   bicicleta   = new Bicicleta("Trek", "Marlin 7");
        Vehiculo    bici2       = new Bicicleta("GW", "Shark");
        Taxi        taxi        = new Taxi("Kia", "Picanto");
        Vehiculo    carro       = new Carro("Audi", "R8");
        Moto        moto        = new Moto("BMW", "GS1200");
        Vehiculo    vehiculo    = new Carro("Renault", "4");

        List<Vehiculo> vehiculos = Arrays.asList(bicicleta, bici2, taxi, carro, moto, vehiculo);

        for (Vehiculo v : vehiculos) {
            v.acelerar(50);
        }
    }
}
