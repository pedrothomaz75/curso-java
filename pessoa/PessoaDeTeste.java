package pessoa;

public class PessoaDeTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("333222111");
        professor.setNome("Pedro");
        professor.setIdade(33);
        professor.setSalario(5000);
        
        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("11155655");
        aluno.setIdade(19);
        aluno.setNome("Alberto");
        aluno.setMatricula("898989");

        System.out.println(aluno.imprimirDadosDaPessoa());


    }    
}
