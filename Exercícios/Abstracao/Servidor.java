package Exercícios.Abstracao;

public class Servidor {

    private String nome;
    private String CPF;
    private Double salario;

    public Servidor( String nome, String CPF, Double salario ) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.1;
    }
}
