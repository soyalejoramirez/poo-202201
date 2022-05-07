package com.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIVA extends Factura {
    public FacturaSinIVA(long valor, String cliente, LocalDate fechaVencimiento) {
        super(valor, cliente, fechaVencimiento);
    }

    @Override
    public long calcularTotal() {
        return this.getValor();
    }
}
