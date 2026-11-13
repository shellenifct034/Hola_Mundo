package com.curso.t03_her_poli_inter.ejemplo002;

public class Animal {
    protected String nombre;
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void comer() {
        System.out.println(nombre + " come algo.");
    }
    public void dormir() {
        System.out.println(nombre + " duerme.");
    }

}
