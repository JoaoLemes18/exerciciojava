import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        TreeMap<String, String> dicionario = new TreeMap<>();
        dicionario.put("cachorro", "Um animal doméstico que late.");
        dicionario.put("gato", "Um animal doméstico que mia.");
        dicionario.put("carro", "Um meio de transporte motorizado.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para buscar sua definição: ");
        String palavra = scanner.nextLine();

        if (dicionario.containsKey(palavra)) {
            System.out.println("Definição de " + palavra + ": " + dicionario.get(palavra));
        } else {
            System.out.println("Palavra não encontrada no dicionário.");
        }
    }
}
