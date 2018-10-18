package Exercícios.Abstracao.Banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca( double saldo, int numConta ) {
        super( saldo, numConta );
    }

    @Override
    public double Correcao() {
        setCorrecao( this.getSaldo() + this.getSaldo() * 0.065 );
        return this.getCorrecao();
    }
}
