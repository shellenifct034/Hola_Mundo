package com.curso.t01_basicos.ejemplo005;

public class Condicionales {
    public static void main(String[] args) {
        int nota=1;
        if(nota>100){
            System.out.println("Nota no válida");
        } else if(nota>=90){
            System.out.println("Sobresaliente");
        } else if (nota>=70) {
            System.out.println("Notable");
        } else if(nota>=50){
            System.out.println("Aprobado");
        }else if (nota>=0){
            System.out.println("Suspenso");
        } else {
            System.out.println("Nota no válida");
        }
        //switch
        int dia1 = 7;
        String nombreDia1;
        switch (dia1) {
            case 1:
                nombreDia1 = "Lunes";
                break;
            case 2:
                nombreDia1 = "Martes";
                break;
            case 3:
                nombreDia1 = "Miércoles";
                break;
            case 4:
                nombreDia1 = "Jueves";
                break;
            case 5:
                nombreDia1 = "Viernes";
                break;
            case 6:
                nombreDia1 = "Sábado";
            case 7:
                nombreDia1 = "Fin de semana";
                break;
            default:
                nombreDia1 = "Día no válido";
                break;
        }
        System.out.println("Hoy es " + nombreDia1);
        int dia = 3;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6, 7 -> "Fin de semana";
            default -> "Día no válido";
        };
        System.out.println("Hoy es " + nombreDia);
        //switch notas
        nota=7;
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Suspenso");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprobado");
                break;
            default:
                System.out.println("Nota no válida");
        }
        //if notas
        if (nota >= 1 && nota <= 5) {
            System.out.println("Suspenso");
        } else if (nota >= 6 && nota <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Nota no válida");
        }
    }
}
