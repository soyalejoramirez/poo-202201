package com.facturacion.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion() {
        facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, long valor, LocalDate fecha) {
        Factura factura;

        if(fecha.isBefore(LocalDate.now())) {
            factura = new FacturaVencida(valor, cliente, fecha);
        } else {
            if (valor >= 100000) {
                factura = new FacturaConIVA(valor, cliente, (short) 19, fecha);
            } else {
                factura = new FacturaSinIVA(valor, cliente, fecha);
            }
        }

        facturas.add(factura);
    }

    public long getTotalFacturacion() {
        return facturas.stream().mapToLong(fac -> fac.calcularTotal()).sum();

//        long sumatoria = 0;
//
//        for (Factura factura : facturas) {
//            sumatoria += factura.calcularTotal();
//        }
//
//        return sumatoria;
    }

    public Factura getFacturaMasCara() {
        // TODO Falta por implementar, parte del reto
        return null;
    }

    public List<FacturaSinIVA> getFacturasSinIva() {
        List<FacturaSinIVA> facturasSinIva = new ArrayList<>();

        for (Factura factura : this.facturas) {
            if (factura instanceof FacturaSinIVA) {
                facturasSinIva.add((FacturaSinIVA) factura);
            }
        }

        return facturasSinIva;

//        return this.facturas.stream()
//                .filter(fac -> fac instanceof FacturaSinIVA)
//                .map(fac -> (FacturaSinIVA) fac)
//                .collect(Collectors.toList());
    }
}
