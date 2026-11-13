package com.curso.t02_clas_obj.ejemplo005;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    // Constructor por defecto explícito
    public Producto() {
        this("Sin nombre", 0.0, 0);
    }
    // Constructor con nombre y precio, stock por defecto
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }
    // Constructor completo
    public Producto(String nombre, double precio, int stock) {
    // Aquí tenemos que asignar los parámetros recibidos a los atributos del objeto
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    //setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre !=null && !nombre.isEmpty()){
            System.out.println("Nombre: " + nombre);
        } else {
            System.out.println("Nombre no válido");
        }
    }
    public double getPrecio() {

        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
        if (precio>=0){
            System.out.println("Precio: " + precio);
        } else {
            System.out.println("Precio no válido");
        }
    }
    public int getStock() {
        return stock; }
    public void setStock(int stock) {
        this.stock = stock;
        if (stock>=0){
            System.out.println("Stock: " + stock);
        } else {
            System.out.println("Stock no válido");
        }
    }
    // Sobrecarga de un metodo
    public void mostrarInfo() {
        System.out.println(nombre + " - " + precio + " € - stock: " + stock);
    }
    public void mostrarInfo(String prefijo) {
        System.out.println(prefijo +nombre + " - " + precio + " € - stock: " + stock);
    }
}