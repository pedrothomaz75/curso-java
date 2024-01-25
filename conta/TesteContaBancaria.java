package conta;

// Acessando atributos
public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando instancias
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumero("1234");
        contaBancaria.setTitular("Pedro");;
        contaBancaria.setSaldo(100);;

        // Realizando um depósito
        contaBancaria.depositar(50);
        contaBancaria.sacar(150);
    }
    
}
