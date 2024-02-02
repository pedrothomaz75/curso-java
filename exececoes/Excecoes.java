package exececoes;

import pessoa.Pessoa;

public class Excecoes {
    // Checked exceptions - Exceções tratáveis


    // Unchecked exceptions - Exceções intratáveis

    public static void main(String[] args) throws Exception{
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }

        Pessoa p = null;
        p.getCpf();
    } 

    public static void validarNumero() throws Exception{
        int numero = 10;
        if(numero < 100) {
            throw new Exception("Número maior que 100");
        }
    }
}
