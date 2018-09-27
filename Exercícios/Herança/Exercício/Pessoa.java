package Exercícios.Herança.Exercício;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String cpf;
    private LocalDate dataNasc;

    public Pessoa(String nome, String cpf, LocalDate dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public void mostrarPessoa(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.dataNasc);
    }
}
