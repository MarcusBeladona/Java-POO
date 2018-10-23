package Exercícios.ContaBancaria;

import java.util.ArrayList;

public class Banco {

   //ContaBancaria contas[] = new ContaBancaria[50];
   ArrayList<ContaBancaria> contas = new ArrayList <>();

    public void inserir ( ContaBancaria conta ) {
        /*for (int j = 0; j < contas.length ; j++) {
            if (contas[j] == null) {
                contas[j] = conta;
            }
        }*/
        contas.add( conta );
    }

   public void remover ( ContaBancaria conta ) {
       /*for (int j = 0; j < contas.length ; j++) {
           if ( contas[j].equals( conta )) {
               contas[j] = null;
           }
       }*/
       contas.remove( conta );
   }

   public ContaBancaria procurarConta (String conta) {
        /*for (int i = 0; i < contas.length ; i++) {
            if ( contas[i].getNumeroDaConta().equals( conta ) ) {
                return contas[i];
            }
        }*/
        for(ContaBancaria c : contas){
            if(c.getNumeroDaConta().equals( conta )){
                return c;
            }
        }
        return null;
    }
}
