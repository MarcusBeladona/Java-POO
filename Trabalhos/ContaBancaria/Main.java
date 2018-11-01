package Trabalhos.ContaBancaria;

public class Main {

    public static void main( String[] args ) {

        ContaCorrente pessoa1 = new ContaCorrente( "2346-4", 2300.50 );
        ContaPoupanca pessoa2 = new ContaPoupanca( "546789-3", 4620 );

        pessoa1.sacar( 2350.50 );
        pessoa2.sacar( 5000 );

        Relatorio rela1 = new Relatorio();
        rela1.gerarRelatorio( pessoa1 );
        rela1.gerarRelatorio( pessoa2 );


    }
}
