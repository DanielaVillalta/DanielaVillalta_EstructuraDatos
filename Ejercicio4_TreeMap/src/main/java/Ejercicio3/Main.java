package Ejercicio3;

import java.util.Map;
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
        String productoMasCaro = null;
        double mayorPrecio = 0;
        String productoMasBarato = null;
        double menorPrecio = Double.MAX_VALUE;

        productos.put("Camisa", 19.99);
        productos.put("Jeans", 29.99);
        productos.put("Sueter", 25.00);
        productos.put("Calcetines", 2.99);
        productos.put("Shorts", 15.99);

        System.out.println("\nProductos en orden alfabético:");
        for(Map.Entry<String, Number> entrada : productos.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        for (Map.Entry<String, Number> entry : productos.entrySet()) {
            double precio = entry.getValue().doubleValue();
            if (precio > mayorPrecio) {
                mayorPrecio = precio;
                productoMasCaro = entry.getKey();
            }
        }

        System.out.println("Producto más caro: " + productoMasCaro + " - $" + mayorPrecio);

        for (Map.Entry<String, Number> entry : productos.entrySet()) {
            double precio = entry.getValue().doubleValue();
            if (precio < menorPrecio) {
                menorPrecio = precio;
                productoMasBarato = entry.getKey();
            }
        }

        System.out.println("Producto más barato: " + productoMasBarato + " - $" + menorPrecio);
    }
}