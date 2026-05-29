package controller;

import model.Professor;
import service.ProfessorService;

import java.util.List;

public class ProfessorController {

    private final ProfessorService professorService = new ProfessorService();

    // CREATE
    public void cadastrarProfessor(Professor professor){
        professorService.cadastrarProfessor(professor);
    }

    // READ
    public List<Professor> listarProfessores(){
        return professorService.listarProfessores();
    }

    // UPDATE
    public String atualizarProfessor(String matricula, String novoNome){
        return professorService.atualizarProfessor(matricula,novoNome);
    }

    // DELETE
    public String deletarProfessor(String matricula){
        return professorService.deletarProfessor(matricula);
    }
}