package Trabalhos.ContaBancaria;

public abstract class ContaBancaria {

    private String numeroDaConta;
    private double saldo;

    public ContaBancaria( String conta, double saldo ) {
        this.numeroDaConta = conta;
        this.saldo = saldo;
    }

    public abstract void sacar( double a);
    public abstract void depositar(double a);

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta( String numeroDaConta ) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo( double saldo ) {
        this.saldo = saldo;
    }

    public void transferir ( double valor, ContaBancaria conta ) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    public void mostrarDados () {
        System.out.println(
                "Conta: " + this.getNumeroDaConta() +
                "\nSaldo: " + this.getSaldo());
    }
}