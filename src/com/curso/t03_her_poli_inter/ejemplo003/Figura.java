package com.curso.t03_her_poli_inter.ejemplo003;

public abstract class Figura {
    protected String color;
    public Figura(String color) {
        this.color = color;
    }
    public abstract double calcularArea();
    public void mostrarInfo() {
        System.out.println("Color: " + color + ", Área: " + calcularArea());
    }
    public String getColor() {
        return color;
    }
}