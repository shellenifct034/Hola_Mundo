package com.curso.t01_basicos.Ejemplo006;

public class Bucles {
    public static void main(String[] args) {
        //while
        /*int contador = 0;
        while (contador < 5) {
            System.out.println("Valor: " + contador);
            contador++;
        }
        System.out.println("He salido del bucle");*/
        //for
        /*for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("He salido del bucle");*/
        //for...each para arrays
        /*int[] numeros = {10, 20, 30, 40};
        for (int n : numeros) {
            System.out.println(n);
        }
        System.out.println("He salido del bucle");*/
        //for con break
        /*for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // sale del bucle cuando i es 5
            }
            System.out.println("i = " + i);
        }
        System.out.println("He salido del bucle");*/
        //for con continue
        /*for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;  // salta esta iteración
            }
            System.out.println("i = " + i);
            if (i == 4) {
                break;  // salta esta iteración
            }
        }
        System.out.println("He salido del bucle");*/
        //bucles anidados
        /*for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("Siguiente fila");
        }
        System.out.println("Tabla completa");*/
        //Tabla de multiplicar
        /*for (int i = 1; i <=5; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <=10; j++) {
                int resultado=i*j;
                System.out.println(i+ "*" +j+ "=" +resultado);
            }*/

    }
}
