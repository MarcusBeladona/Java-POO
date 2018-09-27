package Exercícios.Lista01;

import java.util.Scanner;

public class E {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Digite a primeira nota: ");
        double a = in.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double b = in.nextDouble();
        System.out.println("\nO aluno "+Media(a,b));
    }
    public static String Media(double a, double b){
        if ((a+b)/2 >= 6.9) return "passou!";
        else return "não passou!";
    }
}
