public class EstruturaRepeticao {
    public static void main(String[] args) {

        // WHILE = ENQUANTO
        
        int valorInicial = 0;
        while (valorInicial < 3){
            System.out.println("O valor é menor que 3");
            System.out.println(valorInicial);
            valorInicial++; // valorInicial = valorInicial + 1
        }
        System.out.println("Saiu do while");

        // FOR = PARA
        for (int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + i);
        }
    }
}
