package PartidaJogadores.Model;

public class Partida {

    private int idPartida;


    public Partida ( ) { }

    public void gerarResultado(Time TimeA,Time TimeB){
        System.out.println(TimeA.getNome()+" 1 X 1 "+TimeB.getNome());
    }

}
