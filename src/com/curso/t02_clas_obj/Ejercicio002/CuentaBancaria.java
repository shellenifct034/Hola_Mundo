package com.curso.t02_clas_obj.Ejercicio002;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta=numeroCuenta;
        saldoInicial=0;
        this.titular=titular;
    }
    //Setters y getters de número de cuenta y titular, saldo solo getter
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        if (numeroCuenta !=null && !numeroCuenta.isEmpty()){
            System.out.println(saldo);
        }else {
            System.out.println("Numero de cuenta no válido");
        }
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
        if (titular !=null && !titular.isEmpty()){
            System.out.println(titular);
        }else {
            System.out.println("Nombre de titular no válido");
        }
    }
    public double getSaldo() {
        return saldo;
    }
    //Operaciones bancarias
    public void ingresar(double cantidad) {
        if (cantidad>=0){
            System.out.println("Cantidad a ingresar: " + cantidad);
            saldo=saldo+cantidad;
            System.out.println("Saldo total: " + saldo);
        } else {
            System.out.println("Cantidad no válida");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad>=0 && saldo>cantidad){
            System.out.println("Cantidad a retirar: " + cantidad);
            saldo=saldo-cantidad;
            System.out.println("Saldo total: " +saldo);
        } else {
            System.out.println("Cantidad no válida");
        }
    }
    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " +numeroCuenta+". Nombre del titular: " +titular+ ". Saldo actual: "+saldo);
    }
}
