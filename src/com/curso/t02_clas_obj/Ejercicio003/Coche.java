package com.curso.t02_clas_obj.Ejercicio003;

public class Coche {
    //declaramos atributos
    private String Marca;
    private String Modelo;
    private int velocidadActual;
    //Constructores
    public Coche(String Marca, String Modelo) {
        this.Marca=Marca;
        this.Modelo=Modelo;
    }
    //Setters y getters. solo getters
    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    //métodos
    public void acelerar(int incremento) {
        if (incremento>0){
            if (velocidadActual+incremento<=200){
                velocidadActual +=incremento;
                System.out.println("Velocidad actual: " + velocidadActual);
            } else {
                velocidadActual=200;
                System.out.println("Velocidad máxima: "+velocidadActual);
            }
        } else {
            System.out.println("Incremento no válido. "+ velocidadActual);
        }
    }
    public void frenar(int decremento) {
        if (decremento>0){
            if (velocidadActual-decremento>=0){
                velocidadActual -=decremento;
                System.out.println("Velocidad actual: " + velocidadActual);
            } else {
                velocidadActual=0;
                System.out.println("Velocidad mínima: "+velocidadActual);
            }
        } else {
            System.out.println("Decremento no válido. "+ velocidadActual);
        }
    }
    public void mostrarEstado() {
        System.out.println("Marca: " +Marca+". Modelo: " +Modelo+ ". Velocidad actual"+velocidadActual);
    }
}
