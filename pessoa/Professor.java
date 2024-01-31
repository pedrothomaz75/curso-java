package pessoa;

public class Professor extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescreveu
    String imprimirDadosPessoa(){
        // Vai na classe pai(Pessoa) e vai herdar os dados da classe pessoa
        System.out.println(super.imprimirDadosDaPessoa());
        return "Voce es professor";
    }

}
