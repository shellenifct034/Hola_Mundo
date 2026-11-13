package com.curso.t02_clas_obj.ejemplo001;

public class TestCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.setMarca("Toyota");
        miCoche.setModelo("Corolla");
        Coche tuCoche = new Coche();
        tuCoche.setMarca("Ford");
        tuCoche.setModelo("Focus");
        miCoche.acelerar(50);
        tuCoche.acelerar(30);
        tuCoche.frenar(10);
        System.out.println("Mi coche: " + miCoche.getMarca() + " " + miCoche.getModelo()
                + ", velocidad " + miCoche.getVelocidad());
        System.out.println("Tu coche: " + tuCoche.getMarca() + " " + tuCoche.getModelo()
                + ", velocidad " + tuCoche.getVelocidad());
    }
}
