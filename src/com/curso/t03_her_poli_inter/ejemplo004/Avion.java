package com.curso.t03_her_poli_inter.ejemplo004;

public class Avion implements Volador{
    private String Modelo;
    public Avion (String Modelo){
        this.Modelo=Modelo;
    }
    public Avion(){
        this("Desconocido");
    }
    @Override
    public void volar() {
        System.out.println("El avión "+Modelo+" vuela con motores");
    }
    //No obligatorio sobreescribir, default en interfaz
    @Override
    public void aterrizar(){
        System.out.println("El avión " + Modelo + " aterriza en la pista.");
    }
}
