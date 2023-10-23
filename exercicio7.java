import java.util.*;

public class Exercicio7 {
    public static void main(String[] args) {
        TreeMap<String, String> eventos = new TreeMap<>();
        eventos.put("2023-10-16", "Evento 1");
        eventos.put("2023-10-20", "Evento 2");
        eventos.put("2023-10-18", "Evento 3");

        for (Map.Entry<String, String> evento : eventos.entrySet()) {
            System.out.println(evento.getKey() + ": " + evento.getValue());
        }
    }
}
