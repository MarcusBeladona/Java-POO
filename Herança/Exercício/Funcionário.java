package Herança.Exercício;

import java.time.LocalDate;

public class Funcionário extends Pessoa {

    private String matricula;
    private LocalDate dataAdmissao;
    private double salario;

    public Funcionário(String nome, String cpf, LocalDate dataNasc, String matricula, LocalDate dataEmissao, double salario) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataEmissao;
        this.salario = salario;
    }

    public void mostrarFuncionario(){
        super.mostrarPessoa();
        System.out.println(this.matricula);
        System.out.println(this.dataAdmissao);
        System.out.println(this.salario);
    }
}
