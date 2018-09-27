package Exercícios.Lista01;

import java.util.Scanner;

public class D {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Digite o seu nome: ");
        String a = in.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String b = in.nextLine();
        System.out.println();
        Nome(a,b);
    }
    public static void Nome(String  a,String b){
        for (int i = 0; i < 50; i++) {
            System.out.print(""+a+"\n"+b+"\n");
        }
    }
}
