package Exercícios.Agenda;

public class Pessoa {

    private String nome;
    private String endereco;
    private String email;

    @Override
    public String toString() {
        return "Pessoa{" +
               "nome='" + nome + '\'' +
               ", endereco='" + endereco + '\'' +
               ", email='" + email + '\'' +
               '}';
    }

    public Pessoa( String nome, String endereco, String email ) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco( String endereco ) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
}
