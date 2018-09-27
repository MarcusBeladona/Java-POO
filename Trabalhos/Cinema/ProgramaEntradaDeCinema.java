package Trabalhos.Cinema;

public class ProgramaEntradaDeCinema {

    public static void main(String[] args){

        EntradaDeCinema entrada1 = new EntradaDeCinema("A onda","12:00", "A", "B1",20.0,true);
        EntradaDeCinema entrada2 = new EntradaDeCinema("A onda","12:00", "A", "B2",20.0,true);
        EntradaDeCinema entrada3 = new EntradaDeCinema("A onda","12:00", "A", "B3",20.0,true);

        System.out.println("\nEntrada1 - "+entrada1.toString());
        System.out.println("\nEntrada2 - "+entrada2.toString());
        System.out.println("\nEntrada3 - "+entrada3.toString());

        System.out.println();

        //Desconto comum por idade.
        double A, B, C;

        //Desconto especial com matrícula.
        double D, E, F;

        A = entrada1.calculaValorComDesconto(4, 8, 2007);
        B = entrada2.calculaValorComDesconto(2,5,2005);
        C = entrada3.calculaValorComDesconto(11,10,1993);

        D = entrada1.calculaValorComDesconto(20,2,2002,8375);
        E = entrada2.calculaValorComDesconto(2,5,2005,3456);
        F = entrada3.calculaValorComDesconto(11,10,1993,85413);

        System.out.println("Desconto comum de entrada1: "+A+" R$");
        System.out.println("Desconto comum de entrada2: "+B+" R$");
        System.out.println("Desconto comum de entrada3: "+C+" R$");

        System.out.println();

        System.out.println("Desconto especial de entrada1: "+D+" R$");
        System.out.println("Desconto especial de entrada2: "+E+" R$");
        System.out.println("Desconto especial de entrada3: "+F+" R$");

        System.out.println();

        entrada1.realizarVenda();
        entrada2.realizarVenda();
        entrada3.realizarVenda();
    }
}
