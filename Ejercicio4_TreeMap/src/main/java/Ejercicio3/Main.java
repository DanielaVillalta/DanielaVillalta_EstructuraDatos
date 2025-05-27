package Ejercicio3;

import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Diccionario de precios");
        mostrarTreeMap();
    }

    public static void mostrarTreeMap() {
        TreeMap<String, Number> productos = new TreeMap<>();

        productos.put("Camisa", 19.99);
        productos.put("Jeans", 29.99);
        productos.put("Sueter", 30.00);
        productos.put("Calcetines", 2.99);
        productos.put("Shorts", 15.99);

        System.out.println("Productos ordenados alfabéticamente: " + productos);
        System.out.println("Precio de Jeans: " + productos.get("Jeans"));
        System.out.println("Producto más barato: " + productos.firstEntry());
        System.out.println("Producto más caro: " + productos.lastEntry());
    }
}