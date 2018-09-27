package Provas.AP1.exec;
import Provas.AP1.model.*;

public class Principal {

    public static void main ( String[] args ) {

        MotoTaxi motoTaxi1 = new MotoTaxi ( "João", "HK2859", "POC123", 4.8f );
        MotoTaxi motoTaxi2 = new MotoTaxi ( "Antônio", "HG9069", "YAOI23", 3.6f );

        Corrida corrida1 = new Corrida ( "Praça do Leão", "Campus UFC", 2f );
        Corrida corrida2 = new Corrida ( "Hospital", "Rua Damasceno", 3f );
        Corrida corrida3 = new Corrida ( "Itajubá", "Alagoinha", 1f );

        Cliente cliente1 = new Cliente ( "Tércio", "070.376.230.06", "professor" );
        Cliente cliente2 = new Cliente ( "Max", "040.356.290.01", "estudante" );
        Cliente cliente3 = new Cliente ( "Róy Keany", "024.311.202.69", "idoso" );

        motoTaxi1.realizarCorrida ( cliente2, corrida1 );
        motoTaxi2.realizarCorrida ( cliente3, corrida2 );
        motoTaxi2.realizarCorrida ( cliente1, corrida3 );

        corrida1.calcularValorCorrida ( 5 );
        corrida2.calcularValorCorrida ( 20 );
        corrida3.calcularValorCorrida ( 10 );

        float cor1 = corrida1.getPrecoCorrida ( ) - cliente2.solicitarDesconto ( 10 );
        float cor2 = corrida2.getPrecoCorrida ( ) - cliente3.solicitarDesconto ( 20 );
        float cor3 = corrida3.getPrecoCorrida ( ) - cliente1.solicitarDesconto ( 15 );

        System.out.println ( "\nValor final da corrida 1: " + cor1 );
        System.out.println ( "\nValor final da corrida 2: " + cor2 );
        System.out.println ( "\nValor final da corrida 3: " + cor3 );
    }
}
