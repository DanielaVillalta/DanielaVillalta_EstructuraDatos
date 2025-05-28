package Ejercicio7;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Playlist de Música");
        mostrarLista();
    }

    public static void mostrarLista() {
        LinkedList<String> canciones = new LinkedList<>();

        canciones.add("Night Shift - Lucy Dacus");
        canciones.add("Soon We'll Be Found - Sia");
        canciones.add("Change - Big Thief");
        canciones.add("zombie girl - Adrianne Lenker");
        canciones.add("I Do - Reneé Rapp");
        canciones.add("Simulation Swarm - Big Thief");
        canciones.add("Thoroughfare - Ethel Cain");
        canciones.add("PONTE NASTY - Rauw Alejandro");
        canciones.add("Male Fantasy - Billie Eilish");
        canciones.add("Posing For Cars - Japanese Breakfast");

        //Agregar 3 canciones más
        canciones.add("Sadness As A Gift - Adrianne Lenker");
        canciones.add("WASSUP - Young Miko");
        canciones.add("KLK - Arca");
        System.out.println("\nAgregar 3 canciones más a la lista:");
        System.out.println(canciones.get(10));
        System.out.println(canciones.get(11));
        System.out.println(canciones.get(12));

        System.out.println("\nReproducción siguiente: ");
        canciones.addFirst("Halley's Comet - Billie Eilish");
        System.out.println(canciones.get(0));

        System.out.println("\nLista de canciones:");
        for(String elemento : canciones) {
            System.out.println(elemento);
        }
    }
}