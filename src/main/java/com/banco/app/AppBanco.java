package com.banco.app;

import com.banco.dominio.CuentaBancaria;
import com.banco.dominio.Persona;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria tuCuenta = new CuentaBancaria();

        miCuenta.activar();
        miCuenta.consignar(100000);
        miCuenta.retirar(98000);

        System.out.println("MI CUENTA: " + miCuenta.obtenerSaldoActual());
        System.out.println("TU CUENTA: " + tuCuenta.obtenerSaldoActual());

        List<String> opciones = Arrays.asList("Piedra", "Papel", "Tijera");
        Random random = new Random();

        String opcionAleatoria = opciones.get(random.nextInt(opciones.size()));
        System.out.println(opcionAleatoria);
    }
}
