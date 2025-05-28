package Ejercicio8;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Historial de navegación");
        mostrarList();
    }

    public static void mostrarList() {
        LinkedList<String> historial = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        historial.add("google");
        historial.add("youtube");
        historial.add("github");
        historial.add("teams");
        historial.add("gmail");

        System.out.println("\nLista actual: ");
        for(String elemento : historial) {
            System.out.println(elemento);
        }

        System.out.println("\nAtrás (Presiona ENTER)");
        scan.nextLine();
        historial.removeLast();

        System.out.println("\nLista después de retroceder:");
        for(String elemento : historial) {
            System.out.println(elemento);
        }
    }
}