package com.factorymethod.dominio;

public class AlertaHtml implements IAlerta {

    @Override
    public void mostrar() {
        System.out.println("<script>alert('Hola mundo!')</script>");
    }
}
