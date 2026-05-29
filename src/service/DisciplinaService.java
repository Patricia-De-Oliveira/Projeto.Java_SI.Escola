package service;

import model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaService {

    private final List<Disciplina> disciplinas =
            new ArrayList<>();

    // CREATE
    public void cadastrarDisciplina(
            Disciplina disciplina){

        disciplinas.add(disciplina);
    }

    // READ
    public List<Disciplina> listarDisciplinas(){

        return disciplinas;
    }

    // UPDATE
    public String atualizarDisciplina(
            String codigo,
            String novoNome,
            int novaCarga){

        for(Disciplina d : disciplinas){

            if(d.getNome()
                    .equalsIgnoreCase(codigo)){

                d.setNome(novoNome);
                d.setCargaHoraria(
                        novaCarga
                );

                return "Disciplina atualizada!";
            }

        }

        return "Disciplina não encontrada!";
    }

    // DELETE
    public String deletarDisciplina(
            String codigo){

        for(int i=0;
            i<disciplinas.size();
            i++){

            if(disciplinas.get(i)
                    .getNome()
                    .equalsIgnoreCase(codigo)){

                disciplinas.remove(i);

                return "Disciplina removida!";
            }

        }

        return "Disciplina não encontrada!";
    }

}