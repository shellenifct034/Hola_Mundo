package com.curso.t03_her_poli_inter.ejercicio002;

public class TestVehiculos {
    public static void main(String[] args) {
        Taller taller = new Taller();
        Vehiculo coche = new Coche("Gasolina", 5);
        Vehiculo moto = new Moto("Gasolina", true);
        Vehiculo miKawasaki = new Moto("Gasolina", false);
        taller.revisar(coche);
        taller.revisar(moto);
        taller.revisar(miKawasaki);
        moto.mostrarTipo();
        coche.mostrarTipo();
    }
}
