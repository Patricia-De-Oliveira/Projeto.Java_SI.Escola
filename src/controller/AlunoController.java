package controller;

import model.Aluno;
import service.AlunoService;

import java.util.List;

public class AlunoController {
    private final AlunoService alunoService = new AlunoService();

    public void cadastrarAluno (Aluno aluno) {
       alunoService.cadastrarAluno(aluno);
    }

<<<<<<< HEAD
    public Aluno atualizar (Aluno aluno, String matricula) {
        return alunoService.atualizar(aluno, matricula);
=======
    public List<Aluno> listarAluno () {
        return alunoService.listarAlunos();
>>>>>>> feature/aluno
    }

    public String atualizarAluno (String matricula) {
        return alunoService.atualizarAluno(matricula);
    }

<<<<<<< HEAD
    public void deletar (String matricula) {
        alunoService.deletar(matricula);
=======
    public String deletarAluno (String matricula) {
        return alunoService.deletarAluno(matricula);
>>>>>>> feature/aluno
    }
}