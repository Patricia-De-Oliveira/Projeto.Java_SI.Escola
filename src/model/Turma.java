package model;
import java.util.ArrayList;
import java.util.List;
public class Turma{
    private String nome;
    private List<Disciplina> disciplinas;

    public Turma(){
        disciplinas = new ArrayList<>();
    }

    public Turma(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = (disciplinas != null) ? disciplinas : new ArrayList<>();
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

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + disciplinas.size() +
                '}';
    }
}

