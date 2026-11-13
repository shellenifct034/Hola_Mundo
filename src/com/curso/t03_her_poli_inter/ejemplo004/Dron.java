package com.curso.t03_her_poli_inter.ejemplo004;

public class Dron implements Volador{
    public Dron() {

    }
    @Override
    public void volar() {
        System.out.println("El dron vuela con batería");
    }
}