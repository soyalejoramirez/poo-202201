package com.facturacion.app;

import com.facturacion.dominio.Facturacion;

import java.time.LocalDate;

public class AppFacturacion {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Alejandro", 99900, LocalDate.of(2022, 6, 30));
        facturacion.generarFactura("Diana", 12000, LocalDate.of(2022, 4, 30));
        facturacion.generarFactura("Jorge", 100000, LocalDate.of(2022, 1, 1));

        System.out.println(facturacion.getTotalFacturacion());

        facturacion.getFacturasSinIva().forEach(fsi -> System.out.println(fsi.getCliente()));

        LocalDate fecha = LocalDate.of(2022, 6, 30);
        LocalDate fecha2 = LocalDate.of(2022, 6, 20);
        System.out.println(fecha);
    }
}
