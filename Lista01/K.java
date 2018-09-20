package Lista01;

import java.util.Scanner;

public class K {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite os números: ");
        int a = in.nextInt();
        int b = in.nextInt();
        Cor(a,b);
    }
    public static void Cor(int a, int b){
        if (a%2 == 0 && b%2 == 0) System.out.println("\nAZUL");
        else if (a%2 != 0 && b%2 != 0) System.out.println("\nVERMELHO");
        else if ((a%2 != 0 && b%2 == 0) || (a%2 == 0 && b%2 != 0))
            System.out.println("\nAMARELO");
    }
}
