package pessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // Métodos = Ações da classe
    // Método pode ou não conter argumentos
    String imprimirDadosDaPessoa() {
        return "Nome da pessoa: " + nome + " Idade: " + idade + " documento: " + cpf;
    }

    String imprimirIndice(int indice) {
        return "Indice: " + indice;
    }
}
