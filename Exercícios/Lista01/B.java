package Exercícios.Lista01;

import java.util.Scanner;

public class B {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Digite o primeiro valor: ");
        int a = in.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = in.nextInt();
        Menor(a,b);
    }
    public static void Menor(int a, int b){
        if (a < b) System.out.println("\nO menor é o "+a);
        else if (a > b) System.out.println("\nO menor é "+b);
        else System.out.println("\nAmbos são iguais.");
    }
}
