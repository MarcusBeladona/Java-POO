package Exercícios.Herança.Aula.model;

public class Automovel extends Terrestre {

    private String cor;
    private int numPortas;
    private String placa;

    public Automovel(int capacidade, int numRodas, String cor, int numPortas, String placa) {
        super(capacidade, numRodas);
        this.cor = cor;
        this.numPortas = numPortas;
        this.placa = placa;
    }

    public Automovel() {
        super();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPortoas() {
        return numPortas;
    }

    public void setNumPortoas(int numPortoas) {
        this.numPortas = numPortoas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
