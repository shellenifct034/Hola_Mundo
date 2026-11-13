package com.curso.t03_her_poli_inter.ejemplo001;

public class TestAnimal {
    public static void main(String[] args) {
        Perro p = new Perro("Rex", "Labrador");
        p.comer();      // heredado de Animal, sobrescrito en Perro
        p.ladrar();     // propio de Perro
        System.out.println("Nombre: " + p.getNombre());  // heredado de Animal
        Perro p2=new Perro("Toby", "beagle");
        p2.comer();      // heredado de Animal, sobrescrito en Perro
        p2.ladrar();     // propio de Perro
        System.out.println("Nombre: " + p2.getNombre());  // heredado de Animal
    }
}