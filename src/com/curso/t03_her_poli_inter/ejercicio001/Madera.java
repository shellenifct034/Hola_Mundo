package com.curso.t03_her_poli_inter.ejercicio001;

public class Madera extends Material {
    private double metrosCubicos;
    public Madera(String Nombre, double metrosCubicos){
        super(Nombre);
        this.metrosCubicos=metrosCubicos;
    }
    public Madera(){
        this("Desconocido",0);
    }
    @Override
    public double calcularPrecio() {
        return metrosCubicos*150;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}