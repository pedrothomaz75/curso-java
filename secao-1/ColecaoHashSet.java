import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
     public static void main(String[] args) {
    /*
     * HashSet x HashMap 
     * 
     *  - HashMap possui chave e valor
     *  - HashSet possui só o valor
     */ 

     // Set é a interface
        // Maneira de uso
    // HashSet<tipo> nomeDaVariável = new HashSet<>();
    Set<Integer> numeros = new HashSet<>();

        // Adicionando itens
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        // Deletando itens passando o valor do item
        numeros.remove(12);

        // Verificando se existe o numero 12
        System.out.println(numeros.contains(12));

        System.out.println(numeros.size());

        // Iterando
        // OBS: Caso tenha números repetidos na lista, na hora de imprimir o Set vai só imprimir uma vez o valor do item
        for(Integer elemento : numeros) {
            System.out.println(elemento);
        }
     }
}
