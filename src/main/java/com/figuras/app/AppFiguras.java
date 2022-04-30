package com.figuras.app;

import com.figuras.dominio.Circulo;
import com.figuras.dominio.Cuadrado;
import com.figuras.dominio.FiguraGeometrica;

import java.util.ArrayList;
import java.util.List;

public class AppFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Cuadrado cuadrado = new Cuadrado(2, 3);

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);

        figuras.forEach(figuraGeometrica -> {
            System.out.println("El área del " + figuraGeometrica + " es: " + figuraGeometrica.calcularArea());
            System.out.println("El perímetro del " + figuraGeometrica+ " es: " + figuraGeometrica.calcularPerimetro());
        });
    }
}
