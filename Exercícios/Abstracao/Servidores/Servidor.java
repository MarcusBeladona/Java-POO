package Exercícios.Abstracao.Servidores;

public abstract class Servidor {

    private String nome;
    private String CPF;
    private Double salario;

    public Servidor( String nome, String CPF, Double salario ) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF( String CPF ) {
        this.CPF = CPF;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario( Double salario ) {
        this.salario = salario;
    }
}
