package com.curso.t04_colec_excep.ejemplo001;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GestorTienda {
    public static void main(String[] args) {
        // List: los videojuegos, en orden y con posibles plataformas repetidas
        // Tendremos: The Legend of Zelda, Switch, 2017
        // God of War, PS5, 2018
        // Hollow Knight, PC, 2017
        List <Videojuego> juegos= new ArrayList<>();
        juegos.add(new Videojuego("Zelda", "Switch", 2017));
        juegos.add(new Videojuego("God of War","PS5",2018));
        juegos.add(new Videojuego("Hollow Knight","PC",2017));
        //Videojuego[] videojuegos=new Videojuego[3];
        /*videojuegos[0]=new Videojuego("The Legend of Zelda", "Switch", 2017);
        videojuegos [1]=new Videojuego("God of War","PS5",2018);
        videojuegos [2]=new Videojuego("Hollow Knight","PC",2017);*/
        // —-------------
        // Set: plataformas únicas, sin duplicados
        // Tendremos: Switch
        // PS5
        // Switch (la repetimos y al ser un set deberá ignorarla porque ya existe)
        Set<String> plataformas=new HashSet<>();
        plataformas.add("Switch");
        plataformas.add("PS5");
        plataformas.add("Switch");
        // —-------------
        // Map: reservas por identificador
        // La clave será un Integer (el envoltorio de int) y el valor será una Reserva
        // Tendremos: 1, Zelda, Ana
        // 2, God of War, Luis
        // 1, Zelda, Marta (como estamos repitiendo la clave, reemplazará a la anterior reserva 1.
        Map<Integer,Reserva> reservas=new HashMap<>();
        reservas.put(1,new Reserva("Zelda","Ana"));
        reservas.put(2,new Reserva("God of War","Luis"));
        reservas.put(1,new Reserva("Zelda","María"));
        // —-------------
        // Recorrer la lista
        System.out.println("Videojuegos:");
        for (Videojuego v : juegos) {
            System.out.println("  " + v);
        }
        // —-------------
        // Recorrer el conjunto
        System.out.println("Plataformas:");
        // for equivalente al de juegos, para las plataformas
        for (String plataforma:plataformas){
            System.out.println("  " + plataforma);
        }

        // —-------------
        // Recorrer el mapa con entrySet
        System.out.println("Reservas:");
        for (Map.Entry<Integer, Reserva> entrada : reservas.entrySet()) {
            // muestro por pantalla ID clave : valor
            System.out.println("ID: "+entrada.getKey()+": "+entrada.getValue());
        }
        // —-------------
        // Consultas rápidas
        // println que dice: ¿Hay plataforma PC? y lo concatena al valor (true o false) que devuelva la comprobación que hagamos
        System.out.println("¿Hay plataforma PC? "+ plataformas.contains("PC"));
        // —-------------
        // println que dice: ¿Existe la reserva 3? y lo concatena con la comprobación de si existe dicha reserva
        System.out.println("¿Existe la reserva 3? "+ reservas.containsKey(3));
        // —-------------
        // println que dice: Total de videojuegos: y lo concatena a numero de elementos que tenemos en juegos
        System.out.println("Total de videojuegos: "+juegos.size());
        //comprobación aparte
        Reserva a = new Reserva("Zelda", "Ana");
        Map<Integer, Reserva> m = new HashMap<>();
        m.put(1, a);
        m.put(1, new Reserva("Zelda", "Marta"));
        System.out.println("En el mapa: " + m.get(1)); // Marta
        System.out.println("En la variable: " + a);    // Ana
        System.out.println("¿Misma referencia? " + (m.get(1) == a));

    }
}