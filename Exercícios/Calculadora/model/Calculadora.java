package Exercícios.Calculadora.model;

import Exercícios.Calculadora.exeptions.DivisionZeroException;

public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) throws DivisionZeroException {
            if(b == 0) {
                throw new DivisionZeroException("Não é possível dividir por zero!");
            } else return a / b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }
}
