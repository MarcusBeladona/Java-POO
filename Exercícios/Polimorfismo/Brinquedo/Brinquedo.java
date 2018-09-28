package Exercícios.Polimorfismo.Brinquedo;

public class Brinquedo {

    private String nome;
    private double velocidade;
    private double aceleracao;

    public Brinquedo(){}

    public Brinquedo( String nome, double velocidade, double aceleracao ) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public void mover(){}

    public void velocidade(int velocidade){}

    public void velocidade(double velocidade){}

    public void velocidade(float velocidade, double aceleracao){}

}
