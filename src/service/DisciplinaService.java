package service;

import model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaService {

    private static final List<Disciplina> disciplinas =
            new ArrayList<>();

    // CREATE
    public void cadastrarDisciplina(Disciplina disciplina) {
        if(buscarDisciplinaPorNome(disciplina.getNome()) != null){
            System.out.println("Disciplina já existe.");
            return;
        }
        disciplinas.add(disciplina);
    }

    // READ
    public List<Disciplina> listarDisciplinas() {

        return disciplinas;
    }

    // UPDATE
    public String atualizarDisciplina(String nome, String novoNome, int novaCarga) {
        for (Disciplina d : disciplinas) {
            if (d.getNome().equalsIgnoreCase(nome)) {
                d.setNome(novoNome);
                d.setCargaHoraria(novaCarga);
                return "Disciplina atualizada!";
            }
        }
        return "Disciplina não encontrada!";
    }

    // DELETE
    public String deletarDisciplina(String nome) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getNome().equalsIgnoreCase(nome)) {
                disciplinas.remove(i);
                return "Disciplina removida!";
            }
        }
        return "Disciplina não encontrada!";
    }
    public Disciplina buscarDisciplinaPorNome(String nome) {

        for (Disciplina disciplina : disciplinas) {

            if (disciplina.getNome().equalsIgnoreCase(nome)) {
                return disciplina;
            }
        }

        return null;
    }
    public boolean disciplinaExiste(String nome) {

        return buscarDisciplinaPorNome(nome) != null;
    }
}