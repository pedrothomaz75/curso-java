package pessoa;

public class Aluno extends Pessoa{
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobrescreveu
    String imprimirDadosPessoa(){
        System.out.println(super.imprimirDadosDaPessoa());
        return "Voce es aluno";
    }
}
