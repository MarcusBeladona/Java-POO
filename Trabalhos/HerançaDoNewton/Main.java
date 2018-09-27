package Trabalhos.HerançaDoNewton;

public class Main {

    public static void main(String[] args) {

        Pessoa P1 = new Pessoa("Júlia", "Rua do macaco!", 76552312);
        Fornecedor P2 = new Fornecedor("Mark", "Rua Amazonas", 356532, 600, 200);
        Empregado P3 = new Empregado("Jão","Laete Lifht", 347340, 4, 2600);
        Administrador P4 = new Administrador("Jonas", "Caco Lacerda", 26540, 6, 4000, 200);
        Operario P5 = new Operario("Lek", "Tranquillo", 46346,34,2700,3000);
        Vendedor P6 = new Vendedor("Bambu","Que bambu?", 46462, 69, 3211, 4060);

        System.out.println(P1.toString());
        System.out.println(P2.toString() + P2.obterSaldo());
        System.out.println(P3.toString() + P3.calcularSalario());
        System.out.println(P4.toString() + P4.calcularSalario());
        System.out.println(P5.toString() + P5.calcularSalario());
        System.out.println(P6.toString() + P6.calcularSalario());
    }
}
