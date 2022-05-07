package com.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIVA extends Factura {
    private short valorIva;

    public FacturaConIVA(long valor, String cliente, short valorIva, LocalDate fechaVencimiento) {
        super(valor, cliente, fechaVencimiento);
        this.valorIva = valorIva;
    }

    public long calcularIva() {
        return this.getValor() * this.valorIva / 100;
    }

    @Override
    public long calcularTotal() {
        return this.getValor() + this.calcularIva();
    }
}
