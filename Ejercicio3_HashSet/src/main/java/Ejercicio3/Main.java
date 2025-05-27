package Ejercicio3;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        mostrarHashSet();
    }

    public static void mostrarHashSet() {
        Set<String> palabras = new HashSet<>();

        palabras.add("hola");
        palabras.add("mundo");
        palabras.add("hola");
        palabras.add("java");

        System.out.println("Palabras únicas en mayúscula: ");
        for (String palabra : palabras) {
            System.out.println(palabra.toUpperCase());
        }

    }
}