package com.curso.t03_her_poli_inter.ejemplo004;

public class TestVoladores {
    public static void main(String[] args) {
        Volador[] voladores = new Volador[4];
        voladores[0] = new Pajaro("Águila");
        voladores[1] = new Avion("Boeing 737");
        voladores[2] = new Pajaro("Gorrión");
        voladores[3]= new Dron();
        for (Volador v : voladores) {
            v.volar();
            v.aterrizar();   // polimorfismo + default
        }
        System.out.println("---");
        Volador.info();      // llamada al método static de la interfaz
    }
}
