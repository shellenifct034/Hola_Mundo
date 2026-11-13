package com.curso.t01_basicos.ejercicios001;

import java.util.Scanner;

public class CalculadoraPrecioMetro {
    public static void main (String[] args){
        //creamos el objeto scanner y pedimos al cliente que escriba precio y dimensiones
        Scanner scanner=new Scanner(System.in);
        System.out.print("Introduce el precio total (€): ");
        double precio=scanner.nextDouble();
        System.out.print("Introduce el ancho (m): ");
        double ancho=scanner.nextDouble();
        System.out.print("Introduce el largo (m): ");
        double largo=scanner.nextDouble();
        //calcular el precio por metro cuadrado
        double precioMetro=precio / (ancho*largo);
        System.out.println("La casa vale "+precioMetro);
        String Clasificacion;
        if (precioMetro<1000){
            Clasificacion="Económico";
        } else if (precioMetro<2000){
            Clasificacion="Medio";
        } else if (precioMetro<3000){
            Clasificacion="Caro";
        } else{
            Clasificacion="Muy caro";
        }
        System.out.printf("El precio por metro cuadrado es %.2f €/m² - %s%n", precioMetro, Clasificacion);
        scanner.close();
    }
}
