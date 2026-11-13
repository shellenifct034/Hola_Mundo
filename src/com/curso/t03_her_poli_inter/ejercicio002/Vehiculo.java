package com.curso.t03_her_poli_inter.ejercicio002;

public interface Vehiculo {
    void arrancar();
    void detener();
    default void mostrarTipo(){
        System.out.println("Soy un vehículo");
    }
}