package Exercícios.Interface;

public class CalculadoraImpl implements Calculadora {

    @Override
    public int soma( int a, int b ) {
        return a+b;
    }

    @Override
    public int sub( int a, int b ) {
        return a-b;
    }

    @Override
    public int mult( int a, int b ) {
        return a*b;
    }

    @Override
    public int div( int a, int b ) {
        if(b != 0) return a/b;
        else System.out.println("Não é possível divir por zero!");
        return 0;
    }
}
