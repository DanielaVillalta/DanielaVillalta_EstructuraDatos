package Ejercicio9;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Cola de Atención al Cliente");
        mostrarLista();
    }

    public static void mostrarLista() {
        LinkedList<String> clientes = new LinkedList<>();

        clientes.add("Gerardo Pérez");
        clientes.add("María Ruiz");
        clientes.add("Katya Mena");

        System.out.println("\nClientes en la fila:");
        for(String elementos : clientes) {
            System.out.println(elementos);
        }

        System.out.println("\n" + clientes.getFirst() + " ha sido atendido");
        clientes.removeFirst();

        clientes.addFirst("Josué Guinea");
        System.out.println("\nHa llegado un cliente prioritario: " + clientes.getFirst());

        System.out.println("\nSegunda persona en la fila:" + clientes.get(1));
    }
}