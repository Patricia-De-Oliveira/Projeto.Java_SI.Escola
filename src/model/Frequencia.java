package model;

import util.Validacoes;

public class Frequencia{
    private Aluno aluno;
    private Disciplina disciplina;
    private int faltas;

    private final Validacoes validacoes = new Validacoes();

    public Frequencia(){

    }

    public Frequencia(Aluno aluno, Disciplina disciplina, int faltas) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        setFaltas(faltas);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        if(validacoes.validarFaltas(faltas)){
            this.faltas = faltas;
        }else{
            System.out.println("Faltas inválidas.");
        }

    }

    @Override
    public String toString() {
        return "Frequencia{" +
                "aluno=" + aluno.getNome() +
                ", disciplina=" + disciplina.getNome() +
                ", faltas=" + faltas +
                '}';
    }
}