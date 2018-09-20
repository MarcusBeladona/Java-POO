package Lista01;

import java.util.Scanner;

public class A {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nDigite o primeiro número: ");
        int a = in.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = in.nextInt();

        Maior(a,b);
    }

    public static void Maior(int a, int b) {

        if (a > b) {

            System.out.println("\nO maior destes é o " + a);
        }

        else if (a < b) {

            System.out.println("\nO maior destes é o "+ b);
        }

        else System.out.println("\nAmbos são "+a);

    }

}