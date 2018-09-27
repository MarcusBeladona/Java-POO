package Exercícios.Encapsulamento;

public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private double IRA;

    Aluno(){}

    Aluno(String nome, int idade, String curso, double IRA){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.IRA = IRA;
    }

    public void estudar(String materia) {
        System.out.println("Estudando "+materia+".");
    }

    public void matricular(String materia){
        System.out.println("Matriculado em "+materia+".");
    }

    public double getIRA() {
        return this.IRA;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        if (curso == "SI"||curso == "CC"||curso == "DD"||curso == "EC"||curso == "ES"||curso == "RC"){ this.curso = curso;}
        else System.out.println("Opção de curso inválida!");
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Opção inválida de idade!");
        }
        else this.idade = idade;
    }

    public void setIRA(double IRA) {
        if (IRA < 0) {
            System.out.println("Opção inválida de IRA!");
        }
        else this.IRA = IRA;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void status() {
        System.out.println("\nNome:\t"+this.nome);
        System.out.println("Idade:\t"+this.idade);
        System.out.println("Curso:\t"+this.curso);
        System.out.println("IRA:\t"+this.IRA);
    }
}
