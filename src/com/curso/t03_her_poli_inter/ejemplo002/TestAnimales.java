package com.curso.t03_her_poli_inter.ejemplo002;

public class TestAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Rex");
        animales[1] = new Gato("Misi");
        animales[2] = new Animal("Genérico");
        for (Animal a : animales) {
            a.comer();    // polimorfismo: cada uno ejecuta su versión
        }

        System.out.println("---");

        for (Animal a : animales) {
            a.dormir();   // todos usan la misma versión (no sobrescrita)
        }

        System.out.println("---");

        // Para llamar a métodos específicos, hay que comprobar el tipo
        // instanceof moderno
        for (Animal a : animales) {
            if (a instanceof Perro p) {
                p.ladrar();
            } else if (a instanceof Gato g) {
                g.maullar();
            }
        }
    }
}
