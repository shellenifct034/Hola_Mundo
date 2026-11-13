package com.curso.t03_her_poli_inter.ejemplo002;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    public void comer() {
        System.out.println(nombre + " come pescado.");
    }
    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
    @Override
    public void dormir() {
        System.out.println(nombre + " duerme 10h.");
    }
}
