package PartidaJogadores.Model;

public class Time {

    private String nome;
    private String jogadores[];


    public void addJogador(String X[]){
        this.jogadores = X;
    }

    public Time ( String nome ) {
        this.nome = nome;
        Jogador Jogadores = new Jogador();
    }

    public Time () { }

    public String getNome ( ) {
        return nome;
    }

    public String[] getJogadores ( ) {
        return jogadores;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public void setJogadores ( String[] jogadores ) {
        this.jogadores = jogadores;
    }
}
