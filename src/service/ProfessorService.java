package service;

import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {

    private final List<Professor> professores = new ArrayList<>();

    public void cadastrarProfessor(Professor professor){
        professores.add(professor);
    }

    public List<Professor> listarProfessores(){
        return professores;
    }

}