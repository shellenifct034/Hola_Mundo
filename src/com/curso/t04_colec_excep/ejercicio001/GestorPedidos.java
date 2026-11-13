package com.curso.t04_colec_excep.ejercicio001;
import java.util.HashMap;
import java.util.Map;

public class GestorPedidos {
    private Map<String, Double> pedidos;
    public GestorPedidos() {
        this.pedidos = new HashMap<>();
    }
    public void anadirPedido(String id, double importe) {
        // COMPLETAR: solo si id no existe
        boolean existe=pedidos.containsKey(id);
        if (!existe){
            pedidos.put(id,importe);
        }
    }
    public double obtenerImporte(String id) throws PedidoNoEncontradoException {
        // COMPLETAR: lanzar excepción personalizada si no existe
        if (!pedidos.containsKey(id)){
            throw new PedidoNoEncontradoException("El pedido no existe");
        }
        return pedidos.get(id);
    }
    public double calcularTotal() {
        // COMPLETAR: sumar todos los importes
        double importeTotal=0;
        for (double importe: pedidos.values()){
            importeTotal +=importe;
        }
        return importeTotal;
    }
    public boolean eliminarPedido(String id) {
        // COMPLETAR: eliminar y devolver true si existía
        boolean existe=pedidos.containsKey(id);
        if (existe){
            pedidos.remove(id);
        }
        return existe;
        //return pedidos.remove(id)!=null. Nos lo podemos encontrar.No recomendable, menos legible
    }
}