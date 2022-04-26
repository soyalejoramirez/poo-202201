package com.vehiculo.dominio;

public class Taxi extends Carro {
    private String empresa;
    private int nroPasajeros;

    public void bajarPasajero() {
        if (this.getCapacidad() > 0) {
            this.nroPasajeros -= 1;
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
