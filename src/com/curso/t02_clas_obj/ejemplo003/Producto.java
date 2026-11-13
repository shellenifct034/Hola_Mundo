package com.curso.t02_clas_obj.ejemplo003;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    /*public int getNumero() {
        return numero;
    }

    public Producto(int numero) {
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private int numero;*/
    public Producto(String nombre, double precio, int stock) {
        // AQUÍ vamos a asignar los parámetros a los atributos de la clase
        //Constructor
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public String getNombre() {
        // AQUÍ devolvemos el nombre
        return nombre;
    }
    public void setNombre(String nombre) {
        // AQUÍ validamos y asignamos el parámetro al atributo de la clase
        if (nombre !=null && !nombre.isEmpty()){
            this.nombre=nombre;
            System.out.println("Nombre: " + nombre);
        } else {
            System.out.println("Nombre no válido");
        };
    }
    public double getPrecio() {
        // AQUÍ devolvemos el precio
        return precio;
    }
    public void setPrecio(double precio) {
        // AQUÍ validamos que el precio sea mayor o igual que cero: si se cumple asignamos el parámetro al atributo de la clase; si no se cumple ponemos un mensaje de “Precio no válido”.
        if (precio>=0){
            this.precio=precio;
            System.out.println("Precio: " + precio);
        } else {
            System.out.println("Precio no válido");
        };
    }
    // AQUÍ hacemos el getter y el setter para Stock
    public int getStock() {
        // AQUÍ devolvemos el stock
        return stock;
    }
    public void setStock(int stock) {
        // AQUÍ validamos que el stock sea mayor o igual que cero: si se cumple asignamos el parámetro al atributo de la clase; si no se cumple ponemos un mensaje de “Número no válido”.
        if (stock>=0){
            this.stock=stock;
            System.out.println("Stock: " + stock);
        } else {
            System.out.println("Stock no válido");
        };
    }
    // AQUÍ hacemos un metodo hayStock que devuelva true o false en función de si stock es mayor que cero o no.
    public boolean hayStock(){
        if (stock>0) {
            return true;
        } else{
            return false;
        }
    }
}
