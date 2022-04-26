package com.vehiculo.dominio;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioModelo;
    private double velocidad;
    private int capacidad;

    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioModelo() {
        return anioModelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
