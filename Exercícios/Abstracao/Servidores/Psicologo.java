package Exercícios.Abstracao.Servidores;

public class Psicologo extends Servidor {

    private int consultasFeitas;

    public Psicologo( String nome, String CPF, Double salario, int consultasFeitas ) {
        super( nome, CPF, salario );
        this.consultasFeitas = consultasFeitas;
    }

    @Override
    public double getBonificacao() {
        return this.consultasFeitas * 20;
    }

    public int getConsultasFeitas() {
        return consultasFeitas;
    }

    public void setConsultasFeitas( int consultasFeitas ) {
        this.consultasFeitas = consultasFeitas;
    }
}
