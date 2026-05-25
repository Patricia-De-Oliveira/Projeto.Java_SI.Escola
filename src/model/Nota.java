package model;

import util.Validacoes;

public class Nota{
    private Aluno aluno;
    private Disciplina disciplina;
    private double valor;

    private final Validacoes validacoes = new Validacoes();

    public Nota() {

    }

    public Nota( Aluno aluno,Disciplina disciplina, double valor ) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        setValor(valor);
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(validacoes.validarNota(valor)){
            this.valor = valor;
        }else{
            System.out.println("Nota inválida.");
        }
    }

    @Override
    public String toString() {
        return "Nota{" +
                "aluno=" + (aluno != null ? aluno.getNome() : "Sem aluno") +
                ", disciplina='" + (disciplina != null ? disciplina.getNome() : "Sem disciplina") + '\'' +
                ", valor=" + valor +
                '}';
    }
}