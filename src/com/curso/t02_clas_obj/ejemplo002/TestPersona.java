package com.curso.t02_clas_obj.ejemplo002;

public class TestPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 30);
        System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad());
        p.setEdad(31);
        System.out.println("Nueva edad: " + p.getEdad());
        p.setEdad(-5);   // rechazada por la validación
        p.setEdad(66);
        System.out.println("Edad tras intento inválido: " + p.getEdad());
    }
}
