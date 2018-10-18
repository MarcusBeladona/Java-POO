package Exercícios.Abstracao.Servidores;

public class Professor extends Servidor {

    private int horasMinistradas;

    public Professor( String nome, String CPF, Double salario, int horasMinistradas ) {
        super( nome, CPF, salario );
        this.horasMinistradas = horasMinistradas;
    }

    @Override
    public double getBonificacao() {
        return this.horasMinistradas;
    }

    public int getHorasMinistradas() {
        return horasMinistradas;
    }

    public void setHorasMinistradas( int horasMinistradas ) {
        this.horasMinistradas = horasMinistradas;
    }
}
