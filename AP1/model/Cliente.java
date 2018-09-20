package AP1.model;

public class Cliente {

    private String nome;
    private String cpf;
    private String tipo;

    public Cliente ( String nome, String cpf, String tipo ) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public Cliente ( ) {
    }

    public String getNome ( ) {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getCpf ( ) {
        return cpf;
    }

    public void setCpf ( String cpf ) {
        this.cpf = cpf;
    }

    public String getTipo ( ) {
        return tipo;
    }

    public void setTipo ( String tipo ) {
        this.tipo = tipo;
    }

    public String toString ( ) {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               ", tipo='" + tipo + '\'' +
               '}';
    }

    public float solicitarDesconto ( float valor ) {

        switch ( this.tipo ) {

            case "estudante":
                valor = valor - valor * 0.2f;
                break;

            case "idoso":
                valor = valor - valor * 0.5f;
                break;

            case "policial":
                valor = valor - valor * 0.2f;
                break;

            case "professor":
                valor = valor - valor * 0.1f;
                break;
        }

        return valor;
    }
}
