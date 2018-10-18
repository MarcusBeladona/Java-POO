package Exercícios.Abstracao.Banco;

public abstract class Conta {

    private double saldo;
    private int numConta;
    private double correcao;

    public Conta( double saldo, int numConta ) {
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public abstract double Correcao();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo( double saldo ) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta( int numConta ) {
        this.numConta = numConta;
    }

    public double getCorrecao() {
        return correcao;
    }

    public void setCorrecao( double correcao ) {
        this.correcao = correcao;
    }
}
