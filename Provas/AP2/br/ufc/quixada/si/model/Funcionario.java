package Provas.AP2.br.ufc.quixada.si.model;

public abstract class Funcionario extends Pessoa {

    private String cpf;
    private String matricula;
    private float  salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String matricula, float salario) {
        super(nome);
        this.cpf = cpf;
        this.matricula = matricula;
        this.salario = salario;
    }

    public abstract void darBonificacao();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario cpf = " + cpf + ", matricula = " + matricula + ", salario = " + salario + super.toString();
    }
}
