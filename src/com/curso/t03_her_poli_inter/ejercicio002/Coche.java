package com.curso.t03_her_poli_inter.ejercicio002;

public class Coche extends VehiculoMotor implements Vehiculo{
    private int puertas;
    public Coche (String combustible, int puertas){
        super(combustible);
        this.puertas=puertas;
    }
    public Coche(){
        this("Gasolina",1);
    }

    @Override
    public void arrancar() {
        System.out.println("Coche arrancado con "+combustible + " y "+puertas+" puertas.");
    }

    @Override
    public void detener() {
        System.out.println("Coche detenido");
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Soy un coche");
    }
}
