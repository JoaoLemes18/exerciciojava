import java.util.*;

public class Exercicio10 {
    public static void main(String[] args) {
        HashMap<String, Integer> votos = new HashMap<>();
        votos.put("Candidato A", 500);
        votos.put("Candidato B", 700);
        votos.put("Candidato C", 300);

        int maiorVotos = 0;
        String candidatoVencedor = null;

        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maiorVotos) {
                maiorVotos = entry.getValue();
                candidatoVencedor = entry.getKey();
            }
        }

        System.out.println("Candidato vencedor: " + candidatoVencedor);
    }
}
