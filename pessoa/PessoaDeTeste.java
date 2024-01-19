package pessoa;

public class PessoaDeTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cpf = "333222111";
        pessoa.nome = "Pedro";
        pessoa.idade = 20;

        System.out.println(pessoa.nome);
        System.out.println(pessoa.imprimirDadosDaPessoa());
        System.out.println(pessoa.imprimirIndice(1));
    }    
}
