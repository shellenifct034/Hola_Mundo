package com.curso.t01_basicos.ejercicios003;

import java.util.Scanner;

public class NotaMusicalBucle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número (1-7): ");
            numero = scanner.nextInt();
            String Nombre = switch (numero) {
                case 1 -> "Do";
                case 2 -> "Re";
                case 3 -> "Mi";
                case 4 -> "Fa";
                case 5 -> "Sol";
                case 6 -> "La";
                case 7 -> "Si";
                default -> "Nota no válida";
            };
            System.out.println("La nota musical es " + Nombre);
        } while (numero > 0 && numero < 8);
    }
}
