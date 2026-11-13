package com.curso.t02_clas_obj.ejemplo001;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    public void acelerar(int incremento) {
        velocidad += incremento;
    }
    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }
    public int getVelocidad() {
        return velocidad;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
