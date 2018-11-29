package Provas.AP2.br.ufc.quixada.si.model;

public class Vendedor extends Funcionario {

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, String matricula, float salario) {
        super(nome, cpf, matricula, salario);
    }

    @Override
    public void darBonificacao() {
        setSalario(getSalario() + getSalario() * 0.05f);
    }

    public void realizarVenda(float valorContrato) {
        setSalario(getSalario() + valorContrato * 0.5f);
        darBonificacao();
    }

    @Override
    public String toString() {
        return "Vendedor " + super.toString();
    }
}
