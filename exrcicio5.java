import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        TreeMap<String, Double> estudantes = new TreeMap<>(Collections.reverseOrder());
        estudantes.put("Alice", 85.5);
        estudantes.put("Bob", 92.0);
        estudantes.put("Carol", 78.5);
        estudantes.put("David", 88.0);

        for (Map.Entry<String, Double> entry : estudantes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
