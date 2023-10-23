import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        HashMap<String, Double> catalogo = new HashMap<>();
        catalogo.put("Camiseta", 19.99);
        catalogo.put("Calça Jeans", 39.99);
        catalogo.put("Tênis", 59.99);

        // Adicionar produto
        catalogo.put("Boné", 12.99);

        // Remover produto
        catalogo.remove("Calça Jeans");

        // Atualizar preço de um produto
        catalogo.put("Tênis", 64.99);

        for (String produto : catalogo.keySet()) {
            System.out.println(produto + ": " + catalogo.get(produto));
        }
    }
}
