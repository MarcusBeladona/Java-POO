package Provas.AP2.br.ufc.quixada.si.model;

public abstract class Cliente extends Pessoa {

    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, String endereco) {
        super(nome);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente endereco = " + endereco + super.toString();
    }
}
