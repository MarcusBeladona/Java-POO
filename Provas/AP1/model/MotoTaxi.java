package Provas.AP1.model;

public class MotoTaxi {

    private String nome;
    private String cnh;
    private String placa;
    private float  nota;

    public MotoTaxi ( String nome, String cnh, String placa, float nota ) {
        this.nome = nome;
        this.cnh = cnh;
        this.placa = placa;
        this.nota = nota;
    }

    public MotoTaxi ( ) {
    }

    public String getNome ( ) {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getCnh ( ) {
        return cnh;
    }

    public void setCnh ( String cnh ) {
        this.cnh = cnh;
    }

    public String getPlaca ( ) {
        return placa;
    }

    public void setPlaca ( String placa ) {
        this.placa = placa;
    }

    public float getNota ( ) {
        return nota;
    }

    public void setNota ( float nota ) {
        this.nota = nota;
    }

    public void realizarCorrida ( Cliente cliente, Corrida corrida ) {
        System.out.println ( "\nCliente: " + cliente.getNome ( )
                             + "\nMotoTaxi: " + this.getNome ( )
                             + "\nNota: " + this.getNota ( )
                             + "\nPartida: " + corrida.getPartida ( )
                             + "\nDestino: " + corrida.getDestido ( ) );
    }

    public String toString ( ) {
        return "MotoTaxi{" +
               "nome='" + nome + '\'' +
               ", cnh='" + cnh + '\'' +
               ", placa='" + placa + '\'' +
               ", nota=" + nota +
               '}';
    }
}
