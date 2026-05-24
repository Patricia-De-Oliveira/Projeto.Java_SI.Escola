package model;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, String email, String endereco, String telefone, int idade, boolean ativo, String senha, int matricula) {
        super(nome, email, endereco, telefone, idade, ativo, senha);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
