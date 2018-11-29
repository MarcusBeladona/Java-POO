package Provas.AP2.br.ufc.quixada.si.model;

import java.time.LocalDate;

public class ClientePessoaFisica extends Cliente {

    private String    cpf;
    private LocalDate dataNascimento;

    public ClientePessoaFisica() {
    }

    public ClientePessoaFisica(String nome, String endereco, String cpf, LocalDate dataNascimento) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica cpf = " + cpf +
                ", dataNascimento = " + dataNascimento +
                super.toString();
    }
}
