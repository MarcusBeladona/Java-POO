package Exercícios.Abstracao.Banco;

public class Principal {

    public static void main( String[] args ) {

        Conta um = new ContaCorrente( 230,543678432 );
        Conta dois = new ContaPoupanca( 352, 965434573 );

        System.out.println(um.Correcao());
        System.out.println(dois.Correcao());
    }
}
