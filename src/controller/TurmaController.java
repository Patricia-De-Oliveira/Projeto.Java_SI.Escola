package controller;

import model.Turma;
import service.TurmaService;

import java.util.List;

public class TurmaController {

    private final TurmaService turmaService = new TurmaService();

    // CREATE
    public void cadastrarTurma(Turma turma){
        turmaService.cadastrarTurma(turma);
    }

    // READ
    public List<Turma> listarTurmas(){
        return turmaService.listarTurmas();
    }

    // UPDATE
    public String atualizarTurma(String nome, String novoNome){
        return turmaService.atualizarTurma(nome, novoNome);
    }

    // DELETE
    public String deletarTurma(String nome){
        return turmaService.deletarTurma(nome);
    }
}