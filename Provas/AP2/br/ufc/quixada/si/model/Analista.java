package Provas.AP2.br.ufc.quixada.si.model;

public class Analista extends Funcionario {

    public Analista() {
    }

    public Analista(String nome, String cpf, String matricula, float salario) {
        super(nome, cpf, matricula, salario);
    }

    @Override
    public void darBonificacao() {
        setSalario(getSalario() + getSalario() * 0.02f);
    }

    public void processarContrato(Operadora op, Contrato c) {
        op.cadastrarContratoCliente(c);
        darBonificacao();
    }

    @Override
    public String toString() {
        return "Analista " + super.toString();
    }
}
