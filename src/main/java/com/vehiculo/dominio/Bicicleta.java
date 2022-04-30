package com.vehiculo.dominio;

public class Bicicleta extends Vehiculo {
    private int nroPinones;
    private int nroPlatos;
    private double cadencia;

    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando como una BICI!");
    }

    public int getNroPinones() {
        return nroPinones;
    }

    public void setNroPinones(int nroPinones) {
        this.nroPinones = nroPinones;
    }

    public int getNroPlatos() {
        return nroPlatos;
    }

    public void setNroPlatos(int nroPlatos) {
        this.nroPlatos = nroPlatos;
    }

    public double getCadencia() {
        return cadencia;
    }

    public void setCadencia(double cadencia) {
        this.cadencia = cadencia;
    }
}
