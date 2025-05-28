package Ejercicio6;

import java.util.TreeMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ranking de puntajes");
        mostrarTreeMap();
    }

    public static void mostrarTreeMap() {
        TreeMap<String, Integer> jugadores = new TreeMap<>();
        String mejorJugador = null;
        int mayorPuntaje = 0;

        jugadores.put("Van Dijk", 89);
        jugadores.put("Cristiano Ronaldo", 86);
        jugadores.put("Mbappé", 91);
        jugadores.put("Messi", 88);
        jugadores.put("Raphinha", 84);

        System.out.println("\nJugadores en orden alfabético: ");
        for (Map.Entry<String, Integer> entrada : jugadores.entrySet()) {
            System.out.println("Jugador: " + entrada.getKey() + " - puntaje: " + entrada.getValue());
        }

        for (Map.Entry<String, Integer> entrada : jugadores.entrySet()) {
            if (entrada.getValue() > mayorPuntaje) {
                mayorPuntaje = entrada.getValue();
                mejorJugador = entrada.getKey();
            }
        }

        System.out.println("\nJugador con mayor puntaje: " + mejorJugador + " (" + mayorPuntaje + ")");
    }
}