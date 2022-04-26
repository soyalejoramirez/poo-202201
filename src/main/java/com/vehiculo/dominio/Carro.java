package com.vehiculo.dominio;

public class Carro extends Vehiculo {
    private int nroCambios;
    private String placa;
    private String tipoTransmision;

    public void encenderEstacionarias() {
        System.out.println("Tiene las estacionarias encendidas...");
    }

    public int getNroCambios() {
        return nroCambios;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }
}
