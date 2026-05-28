package controller;

import model.Professor;
import service.ProfessorService;

public class ProfessorController {

    private final ProfessorService service =
            new ProfessorService();

    public void cadastrarProfessor(
            String matricula,
            String nome,
            String disciplina){
    }

    public void listarProfessores(){

        for(Professor p :
                service.listarProfessores()){

            System.out.println(p);
        }

    }

}