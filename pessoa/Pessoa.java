package pessoa;

public class Pessoa {
    String nome, cpf;
    int idade;


    // Métodos = Ações da classe
    // Método pode ou não conter argumentos
    String imprimirDadosDaPessoa() {
        return "Nome da pessoa: " + nome + " Idade: " + idade + " documento: " + cpf;
    }

    String imprimirIndice(int indice) {
        return "Indice: " + indice;
    }
}
