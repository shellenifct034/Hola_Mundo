package com.curso.t03_her_poli_inter.ejemplo002;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void comer() {
        System.out.println(nombre + " come pienso.");
    }
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
    @Override
    public void dormir() {
        System.out.println(nombre + " duerme 8h.");
    }
}
