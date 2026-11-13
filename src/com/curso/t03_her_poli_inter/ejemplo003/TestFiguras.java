package com.curso.t03_her_poli_inter.ejemplo003;

public class TestFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Rojo", 6);
        figuras[1] = new Rectangulo("Azul", 4, 6);
        figuras[2] = new Circulo("Verde", 2);
        for (Figura a:figuras){
            a.mostrarInfo();
        }
    }
}