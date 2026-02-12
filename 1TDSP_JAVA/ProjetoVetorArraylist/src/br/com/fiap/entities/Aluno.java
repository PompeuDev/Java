package br.com.fiap.entities;

public class Aluno {

    //visibilidades..tipo de dados.. atributos


    private String nome;
    private String RM;
    private String turma;
    private int idade;
    private double nota;

    public Aluno(String nome, String RM, String turma, int idade, double nota) {
        this.nome = nome;
        this.RM = RM;
        this.turma = turma;
        this.idade = idade;
        this.nota = nota;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", RM='" + RM + '\'' +
                ", turma='" + turma + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }
}
