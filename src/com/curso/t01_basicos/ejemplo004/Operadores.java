package com.curso.t01_basicos.ejemplo004;

public class Operadores {
    public static void main(String[] args) {
        //operadores matemáticos
        int operandoA=20;
        int operandoB=3;
        int suma= operandoA+operandoB;
        System.out.println(suma);
        int resta= operandoA-operandoB;
        System.out.println(resta);
        int multiplicacion=operandoA*operandoB;
        System.out.println(multiplicacion);
        //división entera
        int divisionEntera=operandoA/operandoB;
        System.out.println(divisionEntera);
        //división decimal
        double operando1 =20;
        int operando2 =3;
        double divisionDecimal = operando1 / operando2;
        System.out.println(divisionDecimal);
        //operadores relacionales
        int numero=9;
        boolean esPar=numero%2==0;
        boolean esMultiploDeTres =numero% 3 == 0;
        System.out.println("El número " +numero+ " es par?: "+esPar);
        System.out.println("El número " +numero+ " es divisible entre tres?: "+ esMultiploDeTres);
        boolean igual=(numero==7);
        boolean distinto=(numero==7);
        boolean mayor=(numero>7);
        boolean menor=(numero<7);
        boolean mayorOIgual=(numero>=7);
        boolean menorOIgual=(numero<=7);
        System.out.println("Es igual?: " + igual);
        System.out.println("Es distinto?: " + distinto);
        System.out.println("Es mayor?: " + mayor);
        System.out.println("Es menor?: " + menor);
        System.out.println("Es mayor o igual?: " + mayorOIgual);
        System.out.println("Es menor o igual?: " + menorOIgual);

        String PalabraA="Hola";
        String PalabraB="Hola";
        boolean SonIgualesString= PalabraA.equals(PalabraB);
        System.out.println("Son iguales?: " + SonIgualesString);
        int edad = 66;
        boolean esAdulto = edad>=18 && edad<=65;
        System.out.println("Adulto?: " + esAdulto);
        //conversión o casting
        double precio = 19.99;
        int precioEntero = (int) precio; // Aquí solo se extrae el valor entero para la asignación
        System.out.println(precioEntero); // Imprime: 19
        System.out.println(precio);       // Imprime: 19.99 (Sigue intacta)
        //Ejemplo de cast
        double resultadoDivision = operandoA / operandoB;   // 3.0
        double resultadoDivisionConCast = (double) operandoA / operandoB;   // 3.5
        System.out.println("operandoA es " + operandoA);
        System.out.println("operandoB es " + operandoB);
        System.out.println("resultadoDivision es " + resultadoDivision);
        System.out.println("resultadoDivisionConCast es " + resultadoDivisionConCast);
    }
}