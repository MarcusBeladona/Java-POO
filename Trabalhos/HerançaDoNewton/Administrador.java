package Trabalhos.HerançaDoNewton;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario() {
        return super.calcularSalario() + this.ajudaDeCusto;
    }

    @Override
    public String toString() {
        return super.toString()+"Administrador{" +
                "ajudaDeCusto=" + ajudaDeCusto +
                '}';
    }
}
