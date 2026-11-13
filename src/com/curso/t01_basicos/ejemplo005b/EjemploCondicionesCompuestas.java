package com.curso.t01_basicos.ejemplo005b;

public class EjemploCondicionesCompuestas {
    public static void main(String[] args) {
        //String nombre = "Paco";
        //String nombre = "";
        String nombre = null;
        int miNumero=98;
        String saludo="hola";
        if (nombre != null && !nombre.isEmpty()) {
            System.out.println("Existe el nombre y no es vacío.");
        } /*else if (nombre != null) {
            System.out.println("Existe el nombre pero está vacío.");
        } */else {
            System.out.println("No existe el nombre.");
        }
    }
}
