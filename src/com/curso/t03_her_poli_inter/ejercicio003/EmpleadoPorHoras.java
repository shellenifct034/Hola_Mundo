package com.curso.t03_her_poli_inter.ejercicio003;

public class EmpleadoPorHoras implements Pagable{
    private String Nombre;
    private double precioHora;
    private double horasTrabajadas;

    public EmpleadoPorHoras(String Nombre, double precioHora, double horasTrabajadas){
        this.Nombre=Nombre;
        this.precioHora=precioHora;
        this.horasTrabajadas=horasTrabajadas;
    }
    public EmpleadoPorHoras(){
        this("Desconocido", 0,0);
    }

    @Override
    public double calcularSalario(){
        return precioHora*horasTrabajadas;
    }
}