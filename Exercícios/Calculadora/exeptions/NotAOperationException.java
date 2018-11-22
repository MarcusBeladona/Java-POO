package Exercícios.Calculadora.exeptions;

public class NotAOperationException extends Exception {

    public NotAOperationException() {
    }

    public NotAOperationException(String message) {
        super(message);
    }
}
