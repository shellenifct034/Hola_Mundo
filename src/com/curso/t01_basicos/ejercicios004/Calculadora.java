package com.curso.t01_basicos.ejercicios004;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        System.out.println("Calculadora");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5. Apagado");
        Scanner scanner=new Scanner(System.in);
        double operando1=0;
        double operando2=0;
        double resultado;
        int opcion;
        do{
            System.out.println("Introduce opción del 1 al 5: ");
            opcion=scanner.nextInt();
            if (opcion >=1 && opcion <= 4){
                System.out.println("Introduce operando1: ");
                operando1=scanner.nextDouble();
                System.out.println("Introduce operando2: ");
                operando2=scanner.nextDouble();
                switch (opcion){
                    case 1:
                        resultado =operando1 + operando2;
                        System.out.println(resultado);
                        break;
                    case 2:
                        resultado =operando1 - operando2;
                        System.out.println(resultado);
                        break;
                    case 3:
                        resultado =operando1 * operando2;
                        System.out.println(resultado);
                        break;
                    case 4:
                        resultado =operando1 / operando2;
                        System.out.println(resultado);
                        break;
                }
            }
        }while (opcion !=5);
        scanner.close();
    }
}
