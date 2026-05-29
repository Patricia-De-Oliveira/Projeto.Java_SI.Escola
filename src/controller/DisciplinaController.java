package controller;

import model.Disciplina;
import service.DisciplinaService;

public class DisciplinaController {

    private final DisciplinaService service =
            new DisciplinaService();

    public void cadastrarDisciplina(
            String codigo,
            String nome,
            int carga){
    }

    public void listarDisciplinas(){

        for(Disciplina d :
                service.listarDisciplinas()){

            System.out.println(d);

        }

    }

    public void atualizarDisciplina(
            String codigo,
            String nome,
            int carga){

        System.out.println(
                service.atualizarDisciplina(
                        codigo,
                        nome,
                        carga
                )
        );
    }

    public void deletarDisciplina(
            String codigo){

        System.out.println(
                service.deletarDisciplina(
                        codigo
                )
        );
    }

}