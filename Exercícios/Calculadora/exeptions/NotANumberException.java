package Exercícios.Calculadora.exeptions;

public class NotANumberException extends Exception {

    public NotANumberException() {
    }

    public NotANumberException(String message) {
        super(message);
    }
}
