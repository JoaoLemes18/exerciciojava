import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Alice", 25);
        pessoas.put("Bob", 30);
        pessoas.put("Carol", 22);
        pessoas.put("David", 28);

        TreeMap<String, Integer> pessoasOrdenadas = new TreeMap<>(pessoas);
        for (String nome : pessoasOrdenadas.keySet()) {
            System.out.println(nome);
        }
    }
}
