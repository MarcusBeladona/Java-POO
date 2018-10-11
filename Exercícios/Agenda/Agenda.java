package Exercícios.Agenda;

public class Agenda {

    Pessoa[] pessoas = new Pessoa[50];
    private int contador = 0;

    public void procurar (int cpf) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof PessoaFisica) {
                if (((PessoaFisica)pessoas[i]).getCpf() == cpf) {
                    System.out.println(((PessoaFisica)pessoas[i]).toString());
                }
            }
        }
    }

    public void adicionar (Pessoa pessoa) {
        pessoas[contador] = pessoa;
        contador++;
    }

    public void remover (Pessoa pessoa) {

    }
}
