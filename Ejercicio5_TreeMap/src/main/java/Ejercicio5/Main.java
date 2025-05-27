package Ejercicio5;

import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Registro de Temperaturas por Ciudad");
        mostrarTreeMap();
    }

    public static void mostrarTreeMap() {
        TreeMap<String, Number> ciudades = new TreeMap<>();

        ciudades.put("San Salvador", 40);
        ciudades.put("Nueva York", 15);
        ciudades.put("Buenos Aires", 10);
        ciudades.put("Mejicanos", 36);
        ciudades.put("Ciudad de Guatemala", 20);

        System.out.println("Ciudades en orden alfabético" + ciudades);
        System.out.println("Ciudad más fría: " + ciudades.firstEntry());
        System.out.println("Ciudad más cálida: " + ciudades.lastEntry());
    }
}