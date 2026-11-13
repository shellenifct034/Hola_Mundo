package com.curso.t04_colec_excep.ejemplo001;

public class Videojuego {
    private String titulo;
    private String plataforma;
    private int anyo;
    public Videojuego(String titulo, String plataforma, int anyo) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anyo = anyo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public int getAnyo() {
        return anyo;
    }
    @Override
    public String toString() {
        return titulo + " (" + plataforma + ", " + anyo + ")";
    }
}