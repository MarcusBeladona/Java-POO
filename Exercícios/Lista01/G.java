package Exercícios.Lista01;

import java.util.Scanner;

public class G {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o número: ");
        int a = in.nextInt();
        Primo(a);
    }
    public static void Primo(int a) {
        for(int i=2; i<a; i++) {
            if (a%i!=0)
                continue;
            else
                System.out.println("Falso");
        }
        System.out.println("Verdadeiro");
    }
}
