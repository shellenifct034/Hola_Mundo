package com.curso.t03_her_poli_inter.ejemplo004;

public interface Volador {
    //Método normal de una interfaz
    void volar();
    //Método por defecto de las subclases
    default void aterrizar() {
        System.out.println("Aterrizando suavemente...");
    }
    //De la interfaz
    static void info() {
        System.out.println("Interfaz Volador: cosas que pueden volar.");
    }
}
