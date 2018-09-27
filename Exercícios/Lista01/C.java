package Exercícios.Lista01;

import java.util.Scanner;

public class C {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Digite o seu nome: ");
        String a = in.nextLine();
        System.out.println();
        Nome(a);
    }
    public static void Nome(String a){
        System.out.print(""+a);
    }
}
