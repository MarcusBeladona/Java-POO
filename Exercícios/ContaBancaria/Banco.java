package Exercícios.ContaBancaria;

import java.util.ArrayList;

public class Banco implements Imprimivel {

   ArrayList<ContaBancaria> contas = new ArrayList <>();

    public void inserir ( ContaBancaria conta ) {
        contas.add( conta );
    }

   public void remover ( ContaBancaria conta ) {
       contas.remove( conta );
   }

   public  ContaBancaria procurarConta (String conta) {
        for(ContaBancaria c : contas){
            if(c.getNumeroDaConta().equals( conta )){
                return c;
            }
        }
        return null;
    }

    @Override
    public void mostrarDados() {
        for (int i = 0; i < contas.size() ; i++) {
            System.out.println(contas.get( i ).getNumeroDaConta());
        }
    }
}