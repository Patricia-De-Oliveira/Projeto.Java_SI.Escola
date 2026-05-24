package model;
public class Frequencia{
    private Aluno aluno;
    private Disciplina disciplina;
    private int totalAulasDadas;
    private int totalPresencas;

    public Frequencia(Aluno aluno, Disciplina disciplina, int totalAulasDadas, int totalPresencas) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.totalAulasDadas = totalAulasDadas;
        this.totalPresencas = totalPresencas;
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

    public int getTotalAulasDadas() {
        return totalAulasDadas;
    }

    public void setTotalAulasDadas(int totalAulasDadas) {
        this.totalAulasDadas = totalAulasDadas;
    }

    public int getTotalPresencas() {
        return totalPresencas;
    }

    public void setTotalPresencas(int totalPresencas) {
        this.totalPresencas = totalPresencas;
    }
}