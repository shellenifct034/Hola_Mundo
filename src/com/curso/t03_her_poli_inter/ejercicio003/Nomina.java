package com.curso.t03_her_poli_inter.ejercicio003;

public class Nomina {
    public static void main(String[] args){
        Pagable[] empleados= new Pagable[4];
        empleados[0]= new EmpleadoAsalariado("Ana",2500);
        empleados[1]=new EmpleadoPorHoras("Luis",15,120);
        empleados[2]= new EmpleadoAsalariado("Marta",3000);
        empleados[3]=new EmpleadoPorHoras("Pedro",20,80);

        double costeTotal =0;
        for (Pagable p:empleados){
            costeTotal +=p.calcularSalario();
        }
        System.out.println("Costes totales :"+costeTotal);
    }
}