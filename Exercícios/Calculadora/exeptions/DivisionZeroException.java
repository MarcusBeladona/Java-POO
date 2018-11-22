package Exercícios.Calculadora.exeptions;

public class DivisionZeroException extends Exception {

    public DivisionZeroException() {
    }

    public DivisionZeroException(String message) {
        super(message);
    }
}
