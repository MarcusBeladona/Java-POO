package Exercícios.Threads.exec;

import Exercícios.Threads.control.AreaCritica;
import Exercícios.Threads.model.Consumidor;

public class PrincipalRegiaoCritica {

    public static void main(String[] args) {

        AreaCritica ac = new AreaCritica();

        Consumidor c1 = new Consumidor(ac, "Pedro", 2000);
        Consumidor c2 = new Consumidor(ac, "Jão", 1500);
        Consumidor c3 = new Consumidor(ac, "Nêgo", 3000);

        c1.start();
        c2.start();
        c3.start();
    }
}
