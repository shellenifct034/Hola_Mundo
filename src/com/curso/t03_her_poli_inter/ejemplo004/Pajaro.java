package com.curso.t03_her_poli_inter.ejemplo004;

public class Pajaro implements Volador {
    private String nombre;
    public Pajaro(String nombre) {
        this.nombre = nombre;
    }
    public Pajaro(){
        this("Desconocido");
    }
    @Override
    public void volar() {
        System.out.println(nombre + " vuela batiendo las alas.");
    }
}