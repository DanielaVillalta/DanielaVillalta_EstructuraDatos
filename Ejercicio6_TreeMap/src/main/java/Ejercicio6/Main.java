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

        jugadores.put("Van Dijk", 89);
        jugadores.put("Cristiano Ronaldo", 86);
        jugadores.put("Mbappé", 91);
        jugadores.put("Messi", 88);
        jugadores.put("Raphinha", 84);

        System.out.println("Jugadores en orden alfabético: " + jugadores);

        String mejorJugador = "";
        int mayorPuntaje = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : jugadores.entrySet()) {
            if (entry.getValue() > mayorPuntaje) {
                mayorPuntaje = entry.getValue();
                mejorJugador = entry.getKey();
            }
        }

        System.out.println("Jugador con mayor puntaje: " + mejorJugador + " (" + mayorPuntaje + ")");
    }
}