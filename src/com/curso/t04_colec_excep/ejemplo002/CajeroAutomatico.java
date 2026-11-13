package com.curso.t04_colec_excep.ejemplo002;

public class CajeroAutomatico {
    private double saldo;
    public CajeroAutomatico(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new CantidadInvalidaException("El saldo inicial no puede ser negativo");
        }
        this.saldo = saldoInicial;
    }
    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad a ingresar debe ser mayor que cero");
        }
        saldo += cantidad;
        System.out.println("Ingreso realizado: +" + cantidad + " €. Saldo actual: " + saldo + " €");
    }
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad a retirar debe ser mayor que cero");
        }
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente. Intentas retirar " + cantidad + " € pero solo hay " + saldo + " €");
        }
        // saldo = saldo - cantidad;
        saldo -= cantidad;
        System.out.println("Retirada realizada: -" + cantidad + " €. Saldo actual: " + saldo + " €");
    }
    public double getSaldo() {
        return saldo;
    }
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico(100);
        // Caso 1: ingreso correcto
        cajero.ingresar(5);
        // Caso 2: retirada correcta
        try {
            cajero.retirar(5);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Caso 3: intento de retirar más de lo que hay
        try {
            cajero.retirar(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Caso 4: intento de ingresar una cantidad negativa (unchecked)
        //No obligación de usarlo
        try {
            cajero.ingresar(-5);
        } catch (CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Caso 5: Retirada negativa
        try {
            cajero.retirar(-5);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Caso 6: finally, se ejecuta siempre
        try {
            cajero.retirar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada. Saldo final: " + cajero.getSaldo() + " €");
        }
    }
}