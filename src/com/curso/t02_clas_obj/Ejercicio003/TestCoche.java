package com.curso.t02_clas_obj.Ejercicio003;

public class TestCoche {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla");


        System.out.println("--- Estado inicial ---");
        coche.mostrarEstado();
        System.out.println("Velocidad por getter: " + coche.getVelocidadActual());


        System.out.println("--- Acelerar 50 ---");
        coche.acelerar(50);
        coche.mostrarEstado();
        System.out.println("Esperado 50, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Acelerar 100 ---");
        coche.acelerar(100);
        coche.mostrarEstado();
        System.out.println("Esperado 150, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Acelerar 100 (debe topar en 200) ---");
        coche.acelerar(100);
        coche.mostrarEstado();
        System.out.println("Esperado 200, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Frenar 50 ---");
        coche.frenar(50);
        coche.mostrarEstado();
        System.out.println("Esperado 150, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Frenar 300 (debe quedar en 0) ---");
        coche.frenar(300);
        coche.mostrarEstado();
        System.out.println("Esperado 0, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Acelerar 0 (incremento no positivo) ---");
        coche.acelerar(0);
        System.out.println("Esperado 0, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Acelerar -10 (incremento no positivo) ---");
        coche.acelerar(-10);
        System.out.println("Esperado 0, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Frenar 0 (decremento no positivo) ---");
        coche.frenar(0);
        System.out.println("Esperado 0, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Frenar -5 (decremento no positivo) ---");
        coche.frenar(-5);
        System.out.println("Esperado 0, obtenido " + coche.getVelocidadActual());


        System.out.println("--- Getters de marca y modelo ---");
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());


        System.out.println("--- Dos coches independientes ---");
        Coche otro = new Coche("Seat", "Ibiza");
        otro.acelerar(80);
        coche.mostrarEstado();
        otro.mostrarEstado();
    }
}
