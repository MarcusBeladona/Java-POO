package Trabalhos.ContaBancaria;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private double limite = 50;

    ContaCorrente( String conta, double saldo ) {
        super( conta, saldo );
    }

    @Override
    public void sacar( double a ) {
        if ( a <= this.getSaldo()+this.limite ) {
            this.setSaldo ( this.getSaldo() - a );
        }
        else System.out.println("Erro. Você passou do seu limite de saque.");
    }

    @Override
    public void depositar( double a ) {
        this.setSaldo( this.getSaldo() + a );
    }

    @Override
    public void mostrarDados() {
        System.out.println(
                "Conta: " + this.getNumeroDaConta() +
                "\nSaldo: " + this.getSaldo() +
                "\nLimite: " + this.limite + "\n"
        );
    }
}
