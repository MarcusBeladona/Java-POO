package Exercícios.Encapsulamento;

public class Principal {
    public static void main(String[] args){

      Aluno Marcus = new Aluno("Marcus",18,"SI",7.1);
      Aluno Joana = new Aluno();

        Joana.setNome("Joana");
        Joana.setIdade(22);
        Joana.setCurso("DD");
        Joana.setIRA(8.5);

        Marcus.status();
        Joana.status();
    }
}
