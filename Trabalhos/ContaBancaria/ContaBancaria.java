package Trabalhos.ContaBancaria;

public abstract class ContaBancaria {

    private String numeroDaConta;
    private double saldo;

    ContaBancaria(String conta, double saldo) {
        this.numeroDaConta = conta;
        this.saldo = saldo;
    }

    public abstract void sacar(double a);

    public abstract void depositar(double a);

    String getNumeroDaConta() {
        return numeroDaConta;
    }

    void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void transferir(double valor, ContaBancaria conta) {
        this.sacar(valor);
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void mostrarDados() {
        System.out.println(
                "Conta: " + this.getNumeroDaConta() +
                "\nSaldo: " + this.getSaldo());
    }
}