package com.curso.t03_her_poli_inter.ejercicio002;

public class Moto extends VehiculoMotor implements Vehiculo {
    private boolean tieneCasco;
    public Moto (String combustible, boolean tieneCasco){
        super(combustible);
        this.tieneCasco=tieneCasco;
    }
    public Moto(){
        this("Gasolina",false);
    }

    @Override
    public void arrancar() {
        if (tieneCasco){
            System.out.println("Coche arrancado con "+combustible + " y con casco.");
        } else {
            System.out.println("Coche arrancado con "+combustible + " y sin casco");
        }
    }
    @Override
    public void detener() {
        System.out.println("Coche detenido");
    }
}
