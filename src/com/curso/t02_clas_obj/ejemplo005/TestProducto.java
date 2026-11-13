package com.curso.t02_clas_obj.ejemplo005;

public class TestProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto("Teclado", 29.99);
        Producto p3 = new Producto("Monitor", 199.99, 5);
        p1.mostrarInfo();
        p2.mostrarInfo("Producto: ");
        p3.mostrarInfo(">> ");
    }
}