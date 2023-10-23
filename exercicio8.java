import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
        HashMap<String, String> sinonimos = new HashMap<>();
        sinonimos.put("feliz", "alegre");
        sinonimos.put("triste", "melancólico");
        sinonimos.put("rápido", "veloz");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para procurar por sinônimos: ");
        String palavra = scanner.nextLine();

        if (sinonimos.containsKey(palavra)) {
            System.out.println("Sinônimos de " + palavra + ": " + sinonimos.get(palavra));
        } else {
            System.out.println("Sinônimos não encontrados para a palavra " + palavra);
        }
    }
}
