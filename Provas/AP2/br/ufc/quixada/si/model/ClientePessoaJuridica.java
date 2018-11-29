package Provas.AP2.br.ufc.quixada.si.model;

import java.time.LocalDate;

public class ClientePessoaJuridica extends Cliente {

    private String    cnpj;
    private LocalDate dataAbertura;

    public ClientePessoaJuridica() {

    }

    public ClientePessoaJuridica(String nome, String endereco, String cnpj, LocalDate dataAbertura) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica cnpj = " + cnpj +
                ", dataAbertura = " + dataAbertura + super.toString();
    }
}
