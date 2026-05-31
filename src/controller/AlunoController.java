package controller;

import model.Aluno;
import service.AlunoService;

import java.util.List;

public class AlunoController {

    private final AlunoService alunoService = new AlunoService();

    // CREATE
    public void cadastrarAluno(Aluno aluno){
        alunoService.cadastrarAluno(aluno);
    }

    // READ
    public List<Aluno> listarAlunos(){
        return alunoService.listarAlunos();
    }

    // UPDATE
    public String atualizarAluno(String matricula, String novoNome){
        return alunoService.atualizarAluno(matricula,novoNome);
    }

    // DELETE
    public String deletarAluno(String matricula){
        return alunoService.deletarAluno(matricula);
    }
    public Aluno buscarAlunoPorMatricula(String matricula) {
        return alunoService.buscarAlunoPorMatricula(matricula);
    }
}