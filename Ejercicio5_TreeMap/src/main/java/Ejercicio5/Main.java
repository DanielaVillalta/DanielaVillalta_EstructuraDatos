package Ejercicio5;

import java.util.Map;
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
        Double mayorTemperatura = 0.0;
        String ciudadMasCalida = null;
        Double menorTemperatura = Double.MAX_VALUE;
        String ciudadMasFria = null;

        ciudades.put("San Salvador", 40);
        ciudades.put("Nueva York", 10);
        ciudades.put("Buenos Aires", 15);
        ciudades.put("Mejicanos", 36);
        ciudades.put("Ciudad de Guatemala", 20);

        System.out.println("\nCiudades en orden alfabético:");
        for(Map.Entry<String, Number> entrada : ciudades.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue() + "°C");
        }

        for (Map.Entry<String, Number> entrada : ciudades.entrySet()) {
            double temperatura = entrada.getValue().doubleValue();
            String ciudad = entrada.getKey();

            if (temperatura > mayorTemperatura) {
                mayorTemperatura = temperatura;
                ciudadMasCalida = ciudad;
            }

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
                ciudadMasFria = ciudad;
            }
        }

        System.out.println("\nCiudad más cálida: " + ciudadMasCalida + " - " + mayorTemperatura + "°C");
        System.out.println("Ciudad más fría: " + ciudadMasFria + " - " + menorTemperatura + "°C");
    }
}