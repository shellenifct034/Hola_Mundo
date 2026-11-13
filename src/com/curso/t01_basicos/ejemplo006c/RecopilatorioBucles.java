package com.curso.t01_basicos.ejemplo006c;

import java.util.Random;
import java.util.Scanner;

public class RecopilatorioBucles {
    public static void main(String[] args) {
        // while
        int contador = 0;
        while (contador < 3) {
            System.out.println("while: " + contador);
            contador++;
        }
        // for
        for (int i = 0; i < 3; i++) {
            System.out.println("for: " + i);
        }
        // do-while con entrada del usuario
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        System.out.println("Número válido: " + numero);
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("break demo: " + i);
        }
        // continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("continue demo: " + i);
        }
        // número aleatorio con while
        Random random = new Random();
        int secreto = random.nextInt(10) + 1; // entre 1 y 10
        int intento;
        do {
            System.out.print("Adivina el número (1-10): ");
            intento = sc.nextInt();
        } while (intento != secreto);
        System.out.println("¡Acertaste!");
        sc.close();
        // Tabla de multiplicar de los números 1 a 5 (bucles anidados)
        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Tabla del " + i + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Deja una línea en blanco entre tabla y tabla
        }
    }
}