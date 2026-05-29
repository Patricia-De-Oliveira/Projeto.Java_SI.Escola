package controller;

import model.Disciplina;
import service.DisciplinaService;

import java.util.List;

public class DisciplinaController {

    private final DisciplinaService disciplinaService = new DisciplinaService();

    // CREATE
    public void cadastrarDisciplina(Disciplina disciplina){
        disciplinaService.cadastrarDisciplina(disciplina);
    }

    // READ
    public List<Disciplina> listarDisciplinas(){
        return disciplinaService.listarDisciplinas();
    }

    // UPDATE
    public String atualizarDisciplina(String nome, String novoNome, int novaCarga){
        return disciplinaService.atualizarDisciplina(nome, novoNome, novaCarga);
    }

    // DELETE
    public String deletarDisciplina(String nome){
        return disciplinaService.deletarDisciplina(nome);
    }
}