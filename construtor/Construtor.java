package construtor;

public class Construtor {
    /*
     *
     * Construtor = Método especial de uma classe que é
     * chamado quando um objeto da classe é instanciado
     *
     * Método construtor tem sempre o nome da classe e ele
     *  não possue retorno
     * 
     * É possivel passar parametros para ele
     */ 

     private int numero;
 
     public Construtor(int numero) {
        this.numero = numero;
     }

     public void setNumero(int numero) {
         this.numero = numero;
     }

     public int getNumero() {
         return numero;
     }
}
