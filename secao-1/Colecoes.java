import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        // Coloca-se chave e valor
        // Map<chave=String, valor=int>
        // Ele não aceita tipos primitivos, então em int, usa-se Integer
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Pedro",10);
        notas.put("Laura", 10);
        notas.put("Cicera", 10);

        // Para ter acesso ao tipo da variável, pode-se usar o "var"
        var nota = notas.get("Pedro");
        System.out.println(nota);

        // Iterando com colections
        /*
         * para cada map que tenha chave igual a uma String
         * e um valor igual a um Integer, a variável entry
         * vai armazenar os dados do Map vindo de notas
        */
        for(Map.Entry<String, Integer> entry : notas.entrySet()) {

            /*
             * Fazendo meio que uma instanciação
             * key é uma String que recebe dados de entry
             * como forma de key
             * 
             * value é um Integer que recebe dados de entry
             * como forma de value
             */
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Chave: " + key + "Valor: " + value);
        }
    }
}
