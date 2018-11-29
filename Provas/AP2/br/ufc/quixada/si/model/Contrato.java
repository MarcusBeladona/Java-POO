package Provas.AP2.br.ufc.quixada.si.model;

import java.time.LocalDate;

public class Contrato {

    private int         codContrato;
    private Cliente     cliente;
    private Funcionario vendedor;
    private LocalDate   dataInicio;
    private float       valorContrato;

    public Contrato() {
    }

    public Contrato(int codContrato, Cliente cliente, Funcionario vendedor, LocalDate dataInicio, float valorContrato) {
        this.codContrato = codContrato;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataInicio = dataInicio;
        this.valorContrato = valorContrato;
    }

    public int getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public float getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(float valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return "Contrato codContrato = " + codContrato +
                ", cliente = " + cliente + ", vendedor = " + vendedor +
                ", dataInicio = " + dataInicio + ", valorContrato = " + valorContrato;
    }
}
