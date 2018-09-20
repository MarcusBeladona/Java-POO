package AP1.model;

public class Corrida {

    private String partida;
    private String destido;
    private float  precoKm;
    private float  precoCorrida;

    public Corrida ( String partida, String destido, float precoKm ) {
        this.partida = partida;
        this.destido = destido;
        this.precoKm = precoKm;
    }

    public Corrida ( ) {
    }

    public String getPartida ( ) {
        return partida;
    }

    public void setPartida ( String partida ) {
        this.partida = partida;
    }

    public String getDestido ( ) {
        return destido;
    }

    public void setDestido ( String destido ) {
        this.destido = destido;
    }

    public float getPrecoKm ( ) {
        return precoKm;
    }

    public void setPrecoKm ( float precoKm ) {
        this.precoKm = precoKm;
    }

    public float getPrecoCorrida ( ) {
        return precoCorrida;
    }

    public void setPrecoCorrida ( float precoCorrida ) {
        this.precoCorrida = precoCorrida;
    }

    public String toString ( ) {
        return "Corrida{" +
               "partida='" + partida + '\'' +
               ", destido='" + destido + '\'' +
               ", precoKm=" + precoKm +
               ", precoCorrida=" + precoCorrida +
               '}';
    }

    public float calcularValorCorrida ( int distancia ) {

        this.precoCorrida = ( distancia * this.precoKm ) + 5;

        return this.precoCorrida;
    }
}
