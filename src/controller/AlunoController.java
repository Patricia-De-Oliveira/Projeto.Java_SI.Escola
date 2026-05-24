package controller;

import model.Aluno;
import service.AlunoService;

import java.util.List;

public class AlunoController {
    private AlunoService alunoService = new AlunoService();

    public Aluno cadastrar (Aluno aluno) {
       return alunoService.cadastrar(aluno);
    }

    public Aluno atualizar (Aluno aluno, int matricula) {
        return alunoService.atualizar(aluno, matricula);
    }

    public List<Aluno> listar () {
        return alunoService.listar();
    }

    public void deletar (int matricula) {
        alunoService.deletar(matricula);
    }
}