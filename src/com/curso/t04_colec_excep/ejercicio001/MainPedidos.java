package com.curso.t04_colec_excep.ejercicio001;

public class MainPedidos {
    public static void main(String[] args) {
        GestorPedidos gestor = new GestorPedidos();
        // Añadir pedidos
        gestor.anadirPedido("P001", 25.50);
        gestor.anadirPedido("P002", 13.20);
        gestor.anadirPedido("P001", 99.99); // no se añade: ya existe
        System.out.println("Total: " + gestor.calcularTotal() + " €");
        // Consultar un pedido existente
        try {
            double importe = gestor.obtenerImporte("P001");
            System.out.println("Importe de P001: " + importe + " €");
        } catch (PedidoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        // Consultar un pedido que no existe
        try {
            double importe = gestor.obtenerImporte("P999");
            System.out.println("Importe de P999: " + importe + " €");
        } catch (PedidoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        // Eliminar un pedido
        if (gestor.eliminarPedido("P002")) {
            System.out.println("Pedido P002 eliminado.");
        } else {
            System.out.println("No se pudo eliminar P002.");
        }
        System.out.println("Total tras eliminar: " + gestor.calcularTotal() + " €");
    }
}