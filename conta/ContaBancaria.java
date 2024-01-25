package conta;

// Conceito de encapsulamento
public class ContaBancaria {

    /*
     * private = Vai basicamente encerrar qualquer tipo de manipulação manual de dados
     * usando o private, ele não será visível para as outras classes
     */
    private String numero;
    private String titular;
    private double saldo;

    // Métodos construtores = É um método que é chamado automaticamente quando o objeto da classe é criado
    // Para não ter que ficar setando toda hora um valor para o saldo, ele já fica padrão com 0
    public ContaBancaria() {
        saldo = 0.0;
    }
    // Getters e Setters = São métodos de manipulação de dados
    // para cada método, é possível criar getters e setters

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
         return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    // Depositar
    void depositar(double valor) {
        if(valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de: " + valor + " saldo atual: " + saldo);
        } else {
            System.out.println("Desposito inválido");
        }
    }

    void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de: " + valor + " saldo atual: " + saldo);
        }
    } 
}
