package Lista01;

import java.util.Scanner;

public class I {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("---- Calculadora Básica --- \n\nDigite o número: ");
        double a = in.nextDouble();
        System.out.print("\n(1)Soma --- (2)Subtração --- (3)Divisão --- (4)Multiplicação\n" +
                "Digite o número de uma das operações acima: ");
        int b = in.nextInt();
        Rep(a, b);
    }
    public static void Rep(double a, int b){
       double c;
        switch (b){
            case 1:
                System.out.print("\nDigite o próximo número: ");
                c = in.nextDouble();
                System.out.println("Resultado: "+(a+c));
            case 2:
                System.out.print("\nDigite o próximo número: ");
                c = in.nextDouble();
                System.out.println("Resultado: "+(a-c));
            case 3:
                System.out.print("\nDigite o próximo número: ");
                c = in.nextDouble();
                System.out.println("Resultado: "+a/c);
            case 4:
                System.out.print("\nDigite o próximo número: ");
                c = in.nextDouble();
                System.out.println("Resultado: "+a*c);
            default :
                System.out.println("Opção inválida!");
        }
    }
}
