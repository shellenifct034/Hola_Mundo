package com.curso.t03_her_poli_inter.ejercicio001;

public class Metal extends Material{
    private double kilogramos;
    public Metal(String Nombre, double kilogramos){
        super(Nombre);
        this.kilogramos=kilogramos;
    }
    public Metal(){
        this("Desconocido",0);
    }
    @Override
    public double calcularPrecio() {
        return kilogramos*8;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}