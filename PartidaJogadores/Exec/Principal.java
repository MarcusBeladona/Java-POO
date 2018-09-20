package PartidaJogadores.Exec;
import PartidaJogadores.Model.*;

public class Principal {

    public static void main(String[] args){

        Time timeA = new Time("Flamengo");
        Time timeB = new Time("Corinthias");

        Partida partidaA = new Partida();
        partidaA.gerarResultado(timeA, timeB);
    }
}
