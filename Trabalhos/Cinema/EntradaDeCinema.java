package Trabalhos.Cinema;

public class EntradaDeCinema {

    private String  titulo;
    private String  horario;
    private String  sala;
    private String  poltrona;
    private double  valor;
    private boolean disponivel;

    public EntradaDeCinema ( String titulo, String horario, String sala,
                             String poltrona, double valor, boolean disponivel ) {
        this.titulo = titulo;
        this.horario = horario;
        this.sala = sala;
        this.poltrona = poltrona;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public double getValor ( ) {
        return valor;
    }

    public String getHorario ( ) {
        return horario;
    }

    public String getPoltrona ( ) {
        return poltrona;
    }

    public String getSala ( ) {
        return sala;
    }

    public String getTitulo ( ) {
        return titulo;
    }

    public double calculaValorComDesconto ( int dia, int mes, int ano ) {

        int idade;

        if ( mes < 9 || ( mes == 9 && dia <= 8 ) ) idade = 2018 - ano;
        else idade = ( 2018 - ano ) - 1;

        if ( idade < 12 ) {
            this.valor = this.valor * 0.5;
        }

        return this.valor;
    }

    public double calculaValorComDesconto ( int dia, int mes, int ano, int carteira ) {

        int idade;
        if ( mes < 9 || ( mes == 9 && dia <= 8 ) ) idade = 2018 - ano;
        else idade = ( 2018 - ano ) - 1;

        if ( idade < 15 && idade > 12 ) {
            this.valor = this.valor * 0.4;
        }
        if ( idade < 21 && idade > 15 ) {
            this.valor = this.valor * 0.3;
        }
        if ( idade > 20 ) {
            this.valor = this.valor * 0.2;
        }

        return this.valor;
    }

    public void realizarVenda ( ) {
        if ( disponivel ) {
            this.disponivel = false;
        }
        if ( !disponivel ) {
            System.out.println("Venda realizada com sucesso!");
        }
    }

    public String toString ( ) {
        return "\nTítulo: " + this.titulo + "\nHorário: " + this.horario + "\nSala: " + this.sala + "\nValor: " + this.valor + "\nPoltrona: " + this.poltrona + "\nDisponível: " + this.disponivel;
    }
}