package Herança.Exercício;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Pessoa P1 = new Pessoa("Andreazo","070.23.123",LocalDate.of(2000,11,23));
        Aluno P2 = new Aluno("Anderson","070.324.35.211",LocalDate.of(1997,9,17),"A765321235");
        Funcionário P3 = new Funcionário("Luiz Espalha Lixo","69.uni.123.02",LocalDate.of(1990,3,27),"520756",LocalDate.of(2017,8,16),3400);
        ChefeDepartamento P4 = new ChefeDepartamento("Roy Roy Roy","193.352.256.2",LocalDate.of(1999,6,14),"B39863",LocalDate.of(2018,2,26),2300,"Monitoria",LocalDate.of(2018,3,18),500);

        P1.mostrarPessoa();
        System.out.println();

        P2.mostrarAluno();
        System.out.println();

        P3.mostrarFuncionario();
        System.out.println();

        P4.mostrarChefeDepartamento();
    }
}
