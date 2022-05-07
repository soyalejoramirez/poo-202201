package com.facturacion.dominio;

import java.time.LocalDate;

public class FacturaVencida extends Factura {
    public static final int VLR_DIA_VENCIDO = 10000;

    public FacturaVencida(long valor, String cliente, LocalDate fechaVencimiento) {
        super(valor, cliente, fechaVencimiento);
    }

    @Override
    public long calcularTotal() {
        return this.getValor() + (VLR_DIA_VENCIDO * getDiasVencidos());
    }

    public int getDiasVencidos() {
        LocalDate fechaActual = LocalDate.now();
        int diasVencimiento = 0;
        // TODO, pendiente por desarrollar para el reto
        return diasVencimiento;
    }
}
