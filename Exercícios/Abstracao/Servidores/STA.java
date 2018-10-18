package Exercícios.Abstracao.Servidores;

import Exercícios.Abstracao.Servidores.Servidor;

public class STA extends Servidor {

    public STA( String nome, String CPF, Double salario ) {
        super( nome, CPF, salario );
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }
}
