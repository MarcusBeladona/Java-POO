package Exercícios.Herança.Exercício;

import java.time.LocalDate;

public class ChefeDepartamento extends Funcionário {

    private String departamento;
    private LocalDate dataPromocao;
    private double gratificacao;

    public ChefeDepartamento(String nome, String cpf, LocalDate dataNasc, String matricula, LocalDate dataAdmissao, double salario, String departamento, LocalDate dataPromocao, double gratificacao) {
        super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public void mostrarChefeDepartamento(){
        super.mostrarFuncionario();
        System.out.println(this.departamento);
        System.out.println(this.dataPromocao);
        System.out.println(this.gratificacao);
    }
}
