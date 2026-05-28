package controller;

import model.Turma;
import service.TurmaService;

public class TurmaController {

    private final TurmaService service =
            new TurmaService();

    public void cadastrarTurma(
            String codigo,
            String nome,
            int semestre){
    }

    public void listarTurmas(){

        for(Turma turma :
                service.listarTurmas()){

            System.out.println(
                    turma
            );

        }

    }

    public void atualizarTurma(
            String codigo,
            String nome,
            int semestre){

        System.out.println(
                service.atualizarTurma(
                        codigo,
                        nome,
                        semestre
                )
        );

    }

    public void deletarTurma(
            String codigo){

        System.out.println(
                service.deletarTurma(
                        codigo
                )
        );

    }

}