package model;


public class Aluno extends Pessoa{

    private String matricula;
    private Turma turma;

    public Aluno() {

    }
    
    public Aluno(String nome, int idade, String cpf, Turma turma, String matricula) {
        super(nome, idade, cpf);
        this.turma = turma;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou um aluno.");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Estudar.");
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", turma=" + (turma != null ? turma.getNome() : "Sem turma") +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
