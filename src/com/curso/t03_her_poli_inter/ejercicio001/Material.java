package com.curso.t03_her_poli_inter.ejercicio001;

public abstract class Material {
    private String Nombre;
    //Constructores
    public Material (String Nombre){
        this.Nombre=Nombre;
    }
    public Material(){
        this("Desconocido");
    }
    //Métodos
    public abstract double calcularPrecio();
    public void mostrarInfo(){
        System.out.println("Material: "+ Nombre+ ", Precio: "+calcularPrecio());
    }
}