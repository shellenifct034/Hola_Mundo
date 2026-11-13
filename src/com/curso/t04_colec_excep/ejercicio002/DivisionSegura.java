package com.curso.t04_colec_excep.ejercicio002;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                // COMPLETAR: pedir números, dividir, mostrar resultado, valido = true;
                System.out.print("Numerador: ");
                int a = scanner.nextInt();
                System.out.print("Denominador: ");
                int b = scanner.nextInt();
                int resultado = a / b;
                System.out.println("Resultado: " + resultado);
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir números enteros.");
                scanner.next(); // limpiar buffer
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero.");
            }
        }
        scanner.close();
    }
}