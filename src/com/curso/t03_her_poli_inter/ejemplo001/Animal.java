package com.curso.t03_her_poli_inter.ejemplo001;

public class Animal {
    protected String nombre;
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
    public String getNombre() {
        return nombre;
    }
}