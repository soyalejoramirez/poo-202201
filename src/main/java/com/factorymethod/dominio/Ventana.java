package com.factorymethod.dominio;

import com.factorymethod.dominio.excepcion.OrigenInvalidoException;

public class Ventana {
    public void mostrarAlerta() {
        String origen = System.getProperty("os.name");
        IAlerta alerta = null;

        System.out.println("El origen es " + origen);

        switch (origen) {
            case "Windows 10":
                alerta = new AlertaWindows();
                break;
            case "html":
                alerta = new AlertaHtml();
                break;
            case "Linux":
                alerta = new AlertaConsola();
                break;
            default:
                throw new OrigenInvalidoException("No se encontró el origen " + origen);
        }

        alerta.mostrar();
    }
}
