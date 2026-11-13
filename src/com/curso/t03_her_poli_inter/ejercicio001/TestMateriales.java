package com.curso.t03_her_poli_inter.ejercicio001;

public class TestMateriales {
    public static void main(String[] args) {
        Material[] materiales = new Material[2];
        materiales[0] = new Madera("Roble", 2.5);
        materiales[1] = new Metal("Aluminio", 12.0);
        for (Material m : materiales) {
            m.mostrarInfo();   // polimorfismo
        }
    }
}