package Exercícios.Herança.Exercício;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String cpf, LocalDate dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public void mostrarAluno(){
        super.mostrarPessoa();
        System.out.println(this.matricula);
    }
}
