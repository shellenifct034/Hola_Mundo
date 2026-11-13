package com.curso.t03_her_poli_inter.ejemplo001;

public class Perro extends Animal{
    private String raza;
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza=raza;
    }
    public void ladrar() {
        System.out.println("¡Guau! Soy " + nombre + ", un " + raza + ".");
    }
    @Override
    public void comer() {
        super.comer();
        System.out.println("Y además, come muy rápido.");
    }
}