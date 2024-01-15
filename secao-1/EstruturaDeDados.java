import java.util.ArrayList;
import java.util.List; // Import da List

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista

        // A List precisa ser importada
        // List<tipo> nomeDaVariável
        // Lista = tipo de interface, não manipulável
        List<String> nomes = new ArrayList<>();
        nomes.add("Pedro"); // add() = método que adiciona elementos na lista
        nomes.add("Laura");
        nomes.add("Cicera");
        
        /*
         * 0 - Pedro
         * 1 - Laura
         * 2 - Cicera
         */

         System.out.println(nomes.get(0));

         // Iterando na List usando o for
         // Para nome na List nomes, print nome
         for(String nome : nomes) {
            System.out.println("Nome: " + nome);
         }

         // Iterando na List usando o foreach, usando o conceito de lambda
         nomes.forEach(nome -> System.out.println(nome));
    }
}
