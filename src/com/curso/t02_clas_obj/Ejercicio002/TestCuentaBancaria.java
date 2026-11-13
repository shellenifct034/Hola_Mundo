package com.curso.t02_clas_obj.Ejercicio002;

public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("ES1234", "Carlos", 1000);
        miCuenta.mostrarDetalles();
        miCuenta.ingresar(6798);
        miCuenta.retirar(200);
        miCuenta.retirar(567); // Debe mostrar mensaje de saldo insuficiente
        //System.out.println("Saldo final: " + miCuenta.getSaldo());
        miCuenta.mostrarDetalles();
    }
}
