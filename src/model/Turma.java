package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos; // possivelmente excluir
    private List<Disciplina> disciplinas;

    public Turma() {
        alunos = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    public Turma(String nome, List<Disciplina> disciplinas, List<Aluno> alunos) {
        this.nome = nome;
        this.disciplinas = (disciplinas != null) ? disciplinas : new ArrayList<>();
        this.alunos = (alunos != null) ? alunos : new ArrayList<>();

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", quantidadeDisciplinas=" + disciplinas.size() +
                ", quantidadeAlunos=" + alunos.size() +
                '}';
    }
}

