package com.curso.t03_her_poli_inter.ejercicio003;

public class EmpleadoAsalariado implements Pagable{
    private String Nombre;
    private double salarioMensual;

    public EmpleadoAsalariado(String Nombre, double salarioMensual){
        this.Nombre=Nombre;
        this.salarioMensual=salarioMensual;
    }
    public EmpleadoAsalariado(){
        this("Desconocido", 0);
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}