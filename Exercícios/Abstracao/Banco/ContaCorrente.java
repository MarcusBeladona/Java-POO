package Exercícios.Abstracao.Banco;

public class ContaCorrente extends Conta {

    public ContaCorrente( double saldo, int numConta ) {
        super( saldo, numConta );
    }

    @Override
    public double Correcao() {
        setCorrecao( this.getSaldo() + this.getSaldo() * 0.013 );
        return this.getCorrecao();
    }
}
