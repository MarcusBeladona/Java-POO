package Provas.AP2.br.ufc.quixada.si.model;

import java.util.ArrayList;
import java.util.List;

public class Operadora implements Imprimivel {

    private int            codOperadora;
    private String         nome;
    private List<Contrato> contratos;
    private List<Cliente>  clientes;

    public Operadora() {
        contratos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public Operadora(int codOperadora, String nome, List<Contrato> contratos, List<Cliente> clientes) {
        this.codOperadora = codOperadora;
        this.nome = nome;
        this.contratos = contratos;
        this.clientes = clientes;
    }


    public void cadastrarContratoCliente(Contrato c) {
        clientes.add(c.getCliente());
        contratos.add(c);
    }

    @Override
    public void mostrarContratos() {
        for(Contrato c : contratos) {
            System.out.println(c.toString());
        }
    }

    public int getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(int codOperadora) {
        this.codOperadora = codOperadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Operadora codOperadora = " + codOperadora +
                ", nome = " + nome + ", contratos = " + contratos +
                ", clientes = " + clientes;
    }
}
