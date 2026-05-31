package service;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    private static final List<Aluno> alunos = new ArrayList<>();

    // CREATE
    public void cadastrarAluno(Aluno aluno){

        if(buscarAlunoPorMatricula(aluno.getMatricula()) != null){
            System.out.println("Aluno já existe.");
            return;
        }
        alunos.add(aluno);
    }

    // READ
    public List<Aluno> listarAlunos(){
        return alunos;
    }

    // UPDATE
    public String atualizarAluno(String matricula, String novoNome){
        for(Aluno aluno : alunos){
            if(aluno.getMatricula().equalsIgnoreCase(matricula)){
                aluno.setNome(novoNome);
                return "Aluno atualizado!";
            }
        }
        return "Aluno não encontrado!";
    }

    // DELETE
    public String deletarAluno(String matricula){
        for(int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getMatricula().equalsIgnoreCase(matricula)){
                alunos.remove(i);
                return "Aluno removido!";
            }
        }
        return "Aluno não encontrado!";
    }
    public Aluno buscarAlunoPorMatricula(String matricula) {

        for (Aluno aluno : alunos) {

            if (aluno.getMatricula().equalsIgnoreCase(matricula)) {
                return aluno;
            }
        }

        return null;
    }
    public boolean alunoExiste(String matricula) {

        return buscarAlunoPorMatricula(matricula) != null;
    }
}