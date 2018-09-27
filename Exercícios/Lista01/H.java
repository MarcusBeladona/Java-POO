package Exercícios.Lista01;

import java.util.Scanner;

public class H {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a primeira nota: ");
        double a = in.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double b = in.nextDouble();
        Prova(a,b);
    }

    public static void Prova(double a, double b){
        if ((a+b)/2 >= 6.9) System.out.println("\nAprovado por conceito A.");
        else if ((a+b)/2 >= 3.9) {
            System.out.print("\nÉ necessário fazer a prova final.\nDigite a terceira nota: ");
            double c = in.nextDouble();
            if ((((a+b)/2)+c)/2 >= 4.9) System.out.println("\nAprovado por conceito B.");
            else System.out.println("\nReprovado.");
        }
        else System.out.println("\nReprovado.");
    }
}
