package controller;

import model.Aluno;
import service.AlunoService;

import java.util.List;

public class AlunoController {
    private final AlunoService alunoService = new AlunoService();

    public void cadastrarAluno (Aluno aluno) {
       alunoService.cadastrarAluno(aluno);
    }

    public List<Aluno> listarAluno () {
        return alunoService.listarAlunos();
    }

    public String atualizarAluno (String matricula) {
        return alunoService.atualizarAluno(matricula);
    }

    public String deletarAluno (String matricula) {
        return alunoService.deletarAluno(matricula);
    }
}