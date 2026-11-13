package com.curso.t03_her_poli_inter.ejercicio002;

public abstract class VehiculoMotor implements Vehiculo{
    protected String combustible;
    public VehiculoMotor(String combustible){
        this.combustible=combustible;
    }
}
