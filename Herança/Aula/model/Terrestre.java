package Herança.Aula.model;

public class Terrestre extends Transporte {

    private int numRodas;

    public Terrestre(int capacidade, int numRodas) {
        super(capacidade);
        this.numRodas = numRodas;
    }

    public Terrestre () {
        super();
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
}
