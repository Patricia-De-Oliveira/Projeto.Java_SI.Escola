package service;

import model.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaService {

    private final List<Turma> turmas =
            new ArrayList<>();

    // CREATE
    public void cadastrarTurma(
            Turma turma){

        turmas.add(turma);
    }

    // READ
    public List<Turma> listarTurmas(){

        return turmas;
    }

    // UPDATE
    public String atualizarTurma(
            String codigo,
            String novoNome,
            int novoSemestre){

        for(Turma turma : turmas){

            if(turma.getNome()
                    .equalsIgnoreCase(codigo)){

                turma.setNome(
                        novoNome
                );



                return "Turma atualizada!";
            }

        }

        return "Turma não encontrada!";
    }

    // DELETE
    public String deletarTurma(
            String codigo){

        for(int i=0;
            i<turmas.size();
            i++){

            if(turmas.get(i)
                    .getNome()
                    .equalsIgnoreCase(codigo)){

                turmas.remove(i);

                return "Turma removida!";
            }

        }

        return "Turma não encontrada!";
    }

}