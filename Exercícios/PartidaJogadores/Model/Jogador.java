package Exercícios.PartidaJogadores.Model;

public class Jogador {

    private String nome;
    private String cpf;

    public Jogador ( String nome, String cpf ) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Jogador ( ) { }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public void setCpf ( String cpf ) {
        this.cpf = cpf;
    }

    public String getNome ( ) {
        return nome;
    }

    public String getCpf ( ) {
        return cpf;
    }
}
