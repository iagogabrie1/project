package Notas;

public class Aluno {
    protected String nome;
    protected String disciplina;
    protected double[] notas;

    public Aluno(String nome, String disciplina, double[] notas) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        return media > 10 ? 10 : media;
    }
}
