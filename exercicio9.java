import java.util.*;

public class Exercicio9 {
    public static void main(String[] args) {
        TreeMap<String, String> agenda = new TreeMap<>();
        agenda.put("Alice", "123-456-7890");
        agenda.put("Bob", "987-654-3210");
        agenda.put("Carol", "555-123-4567");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um contato para buscar o número de telefone: ");
        String nome = scanner.nextLine();

        if (agenda.containsKey(nome)) {
            System.out.println("Número de telefone de " + nome + ": " + agenda.get(nome));
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }
}
