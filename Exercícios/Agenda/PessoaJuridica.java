package Exercícios.Agenda;

public class PessoaJuridica extends Pessoa {

    private int cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    @Override
    public String toString() {
        super.toString();
        return "PessoaJuridica{" +
               "cnpj=" + cnpj +
               ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
               ", razaoSocial='" + razaoSocial + '\'' +
               '}';
    }

    public PessoaJuridica( String nome, String endereco, String email, int cnpj, String inscricaoEstadual, String razaoSocial ) {
        super( nome, endereco, email );
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj( int cnpj ) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual( String inscricaoEstadual ) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial( String razaoSocial ) {
        this.razaoSocial = razaoSocial;
    }
}
