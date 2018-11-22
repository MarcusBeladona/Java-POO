package Exercícios.Calculadora.exec;

import Exercícios.Calculadora.exeptions.DivisionZeroException;
import Exercícios.Calculadora.model.Calculadora;

public class Principal {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        while(true) {

            try {
                System.out.println(calculadora.divide(1, 0));
            } catch (DivisionZeroException e) {
                System.out.println(e.getMessage());
            }

            try {
                System.out.println(calculadora.divide(4, 2));
            } catch (DivisionZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}