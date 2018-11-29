package Exercícios.Threads.control;

public class AreaCritica {

    public synchronized void acessa(String nome, int tempo) {

        System.out.println(nome + " - Entrando na região crítica.");
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
