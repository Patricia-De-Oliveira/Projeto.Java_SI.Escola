package service;

import model.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaService {

    private static final List<Turma> turmas = new ArrayList<>();

    // CREATE
    public void cadastrarTurma(Turma turma){

        if(buscarTurmaPorNome(turma.getNome()) != null){
            System.out.println("Turma já existe.");
            return;
        }
        turmas.add(turma);
    }

    // READ
    public List<Turma> listarTurmas(){
        return turmas;
    }

    // UPDATE
    public String atualizarTurma(String nome, String novoNome){
        for(Turma turma : turmas){
            if(turma.getNome().equalsIgnoreCase(nome)){
                turma.setNome(novoNome);
                return "Turma atualizada!";
            }
        }
        return "Turma não encontrada!";
    }

    // DELETE
    public String deletarTurma(String nome){
        for(int i = 0; i < turmas.size(); i++){
            if(turmas.get(i).getNome().equalsIgnoreCase(nome)){
                turmas.remove(i);
                return "Turma removida!";
            }
        }
        return "Turma não encontrada!";
    }
    public Turma buscarTurmaPorNome(String nome) {

        for (Turma turma : turmas) {

            if (turma.getNome().equalsIgnoreCase(nome)) {
                return turma;
            }
        }

        return null;
    }
    public boolean turmaExiste(String nome) {

        return buscarTurmaPorNome(nome) != null;
    }
}