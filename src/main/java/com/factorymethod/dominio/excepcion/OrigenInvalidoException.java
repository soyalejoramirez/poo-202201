package com.factorymethod.dominio.excepcion;

public class OrigenInvalidoException extends RuntimeException {
    public OrigenInvalidoException(String mensaje) {
        super(mensaje);
    }
}
