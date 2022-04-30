package com.vehiculo.dominio;

public class Taxi extends Carro {
    private String empresa;
    private int nroPasajeros;

    public Taxi(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelera el Taxi!");
    }

    public void bajarPasajero() {
        if (this.getCapacidad() > 0) {
            super.encenderEstacionarias();
            this.nroPasajeros -= 1;
            super.apagarEstacionarias();
        } else {
            System.out.println("No puede bajar pasajeros porque está vacío...");
        }
    }

    public void subirPasajero() {
        if (this.nroPasajeros < this.getCapacidad()) {
            this.nroPasajeros += 1;
        } else {
            System.out.println("No puede subir a nadie más. Va full.");
        }
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }
}
