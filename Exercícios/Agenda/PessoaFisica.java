package Exercícios.Agenda;
import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    private int cpf;
    private LocalDate nascimento;
    private String estadoCivil;

    @Override
    public String toString() {
        super.toString();
        return "PessoaFisica{" +
               "cpf=" + cpf +
               ", nascimento=" + nascimento +
               ", estadoCivil='" + estadoCivil + '\'' +
               '}';
    }

    public PessoaFisica( String nome, String endereco, String email, int cpf, LocalDate nascimento, String estadoCivil ) {
        super( nome, endereco, email );
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.estadoCivil = estadoCivil;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf( int cpf ) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento( LocalDate nascimento ) {
        this.nascimento = nascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil( String estadoCivil ) {
        this.estadoCivil = estadoCivil;
    }
}
