package Trabalhos.ContaBancaria;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

    private double taxaDeOperacao = 0.055;

    public ContaPoupanca( String conta, double saldo ) {
        super( conta, saldo );
    }

    @Override
    public void sacar( double a ) {
        if ( a <= this.getSaldo() ) {
            a -= a * taxaDeOperacao;
            this.setSaldo( this.getSaldo() - a );
        }
        else System.out.println("Erro.\nInsira um valor igual ou menor que o seu saldo.");
    }

    @Override
    public void depositar( double a ) {
        a -= a * taxaDeOperacao;
        this.setSaldo( this.getSaldo() + a );
    }

    @Override
    public void mostrarDados () {
        System.out.println(
                "Conta: " + this.getNumeroDaConta() +
                "\nSaldo: " + this.getSaldo() +
                "\nTaxa: " + this.taxaDeOperacao * 100 + "%\n"
        );
    }
}
