package Trabalhos.HerançaDoNewton;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double valorVendas) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.valorVendas = valorVendas;
        this.comissao = valorVendas * 0.25;
    }

    public double calcularSalario () {
        return super.calcularSalario() + this.comissao;
    }

    @Override
    public String toString() {
        return super.toString()+"Vendedor{" +
                "valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                '}';
    }
}
