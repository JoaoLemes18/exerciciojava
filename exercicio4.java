import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>();
        produtos.put("Celular", 999.99);
        produtos.put("Notebook", 1499.99);
        produtos.put("Fone de Ouvido", 49.99);

        double somaPrecos = 0;
        for (Double preco : produtos.values()) {
            somaPrecos += preco;
        }

        double precoMedio = somaPrecos / produtos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
