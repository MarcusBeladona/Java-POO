package Lista01;

import java.util.Scanner;

public class F {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o número: ");
        int a = in.nextInt();
        System.out.print("\n"+Fat(a));
    }

    public static int Fat(int a){
        int b = a;
        a--;
        do {
            b = b * a;
            a--;
        } while (a>0);

        return b;
    }
}
