package com.curso.t04_colec_excep.ejemplo002;

public class CantidadInvalidaException extends RuntimeException {
    public CantidadInvalidaException(String mensaje) {
        super(mensaje);
    }
}