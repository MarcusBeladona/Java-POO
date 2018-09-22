package Herança.HerançaDoNewton;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double valorProducao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.valorProducao = valorProducao;
        this.comissao = valorProducao * 0.3;
    }

    public double calcularSalario () {
        return super.calcularSalario() + this.comissao;
    }

    @Override
    public String toString() {
        return super.toString()+"Operario{" +
                "valorProducao=" + valorProducao +
                ", comissao=" + comissao +
                '}';
    }
}
