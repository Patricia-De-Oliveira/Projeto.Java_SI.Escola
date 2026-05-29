package service;

import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {

    private final List<Professor> professores = new ArrayList<>();

    // CREATE
    public void cadastrarProfessor(Professor professor){
        professores.add(professor);
    }

    // READ
    public List<Professor> listarProfessores(){
        return professores;
    }

    // UPDATE
    public String atualizarProfessor(String matricula, String novoNome){
        for(Professor professor : professores){
            if(professor.getMatricula().equalsIgnoreCase(matricula)){
                professor.setNome(novoNome);
                return "Professor atualizado!";
            }
        }

        return "Professor não encontrado!";
    }

    // DELETE
    public String deletarProfessor(String matricula){
        for(int i = 0; i < professores.size(); i++){
            if(professores.get(i).getMatricula().equalsIgnoreCase(matricula)){
                professores.remove(i);
                return "Professor removido!";
            }
        }
        return "Professor não encontrado!";
    }
}