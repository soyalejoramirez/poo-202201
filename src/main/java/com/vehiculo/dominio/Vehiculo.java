package com.vehiculo.dominio;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anioModelo;
    private double velocidad;
    private int capacidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(int incremento) {
        this.velocidad += incremento;
        System.out.println("Acelerando el VEHICULO.");
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
        System.out.println("Frenando el VEHICULO.");
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
