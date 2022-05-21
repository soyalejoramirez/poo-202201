package com.factorymethod.dominio;

public class AlertaConsola implements IAlerta {
    @Override
    public void mostrar() {
        System.out.println("Esto es una alerta en una consola");
    }
}
