package Lista01;

import java.util.Scanner;

public class J {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o seu dia de nascimento: ");
        int dia = in.nextInt();
        System.out.print("Digite o seu mês de nascimento: ");
        int mes = in.nextInt();
        System.out.print("Digite o seu ano de nascimento: ");
        int ano = in.nextInt();

        double safadeza = Fat(mes)+(ano/100)*(50-dia);
        double anjo = 1000 - safadeza;

        System.out.print("\nSafado: "+safadeza/10+"%");
        System.out.println("\nAnjo: "+anjo/10+"%");
    }
    public static int Fat(int mes){
        int a = mes;
        for (int i = mes-1; i > 0; i--) {
            a = a + i;
        }
        return a;
    }
}