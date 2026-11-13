package com.curso.t01_basicos.ejemplo006b;
import java.util.Scanner;
public class PedirNumero {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        System.out.println("Número válido: " + numero);
        sc.close();
    }
}
