package Trabalhos.ContaBancaria;

import java.util.ArrayList;

public class Banco implements Imprimivel {

    private ArrayList<ContaBancaria> contas = new ArrayList <>();

    void inserir ( ContaBancaria conta ) {
        contas.add( conta );
    }

    void remover ( ContaBancaria conta ) {
       contas.remove( conta );
   }

   ContaBancaria procurarConta (String conta) {
        for(ContaBancaria aux : contas){
            if(aux.getNumeroDaConta().equals( conta )){
                return aux;
            }
        }
        return null;
    }

    @Override
    public void mostrarDados() {
        for (ContaBancaria conta : contas) {
            System.out.println(conta.getNumeroDaConta());
        }
    }
}