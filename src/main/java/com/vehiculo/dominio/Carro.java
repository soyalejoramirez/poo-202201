package com.vehiculo.dominio;

public class Carro extends Vehiculo {
    private int nroCambios;
    private String placa;
    private String tipoTransmision;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando como Carro!");
    }

    public void encenderEstacionarias() {
        System.out.println("Tiene las estacionarias encendidas...");
    }

    public void apagarEstacionarias() {
        System.out.println("Acaba de apagar las estacionarias...");
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
