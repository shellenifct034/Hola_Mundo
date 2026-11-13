package com.curso.t02_clas_obj.ejemplo003;

public class TestProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Teclado", 9.98, 898);
        System.out.println("Producto: " + p.getNombre() + ", precio: " + p.getPrecio()
                + ", stock: " + p.getStock());
        System.out.println("¿Hay stock? " + p.hayStock());
        p.setStock(-5);   // rechazado
        p.setPrecio(-10); // rechazado
        p.setStock(95);
        p.setPrecio(9865);
        System.out.println("Tras intentos inválidos, stock: " + p.getStock()
                + ", precio: " + p.getPrecio());
    }
}