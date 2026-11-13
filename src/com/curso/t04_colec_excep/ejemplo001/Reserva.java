package com.curso.t04_colec_excep.ejemplo001;

public class Reserva {
    private String tituloJuego;
    private String nombreCliente;
    public Reserva(String tituloJuego, String nombreCliente) {
        this.tituloJuego = tituloJuego;
        this.nombreCliente = nombreCliente;
    }
    public String getTituloJuego() {
        return tituloJuego;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    @Override
    public String toString() {
        return tituloJuego + " -> " + nombreCliente;
    }
}