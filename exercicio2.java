import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        String frase = "Isso é um exercício para contar palavras em uma frase em um HashMap";
        String[] palavras = frase.split(" ");

        HashMap<String, Integer> frequenciaPalavras = new HashMap<>();

        for (String palavra : palavras) {
            frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
        }

        for (String palavra : frequenciaPalavras.keySet()) {
            System.out.println(palavra + ": " + frequenciaPalavras.get(palavra));
        }
    }
}
