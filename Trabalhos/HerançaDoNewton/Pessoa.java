package Trabalhos.HerançaDoNewton;

public class Pessoa {

    private String nome;
    private String endereco;
    private int telefone;

    Pessoa() {
    }

    Pessoa( String nome, String endereco, int telefone ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa( String nome, String endereco ) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
               "nome='" + nome + '\'' +
               ", endereco='" + endereco + '\'' +
               ", telefone=" + telefone +
               '}';
    }
}
