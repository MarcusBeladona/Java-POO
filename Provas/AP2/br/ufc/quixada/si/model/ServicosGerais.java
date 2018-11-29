package Provas.AP2.br.ufc.quixada.si.model;

public class ServicosGerais extends Funcionario {

    public ServicosGerais() {
    }

    public ServicosGerais(String nome, String cpf, String matricula, float salario) {
        super(nome, cpf, matricula, salario);
    }

    @Override
    public void darBonificacao() {
        setSalario(getSalario() + 3);
    }

    public void limpar() {
        darBonificacao();
    }

    @Override
    public String toString() {
        return "ServicosGerais " + super.toString();
    }
}
