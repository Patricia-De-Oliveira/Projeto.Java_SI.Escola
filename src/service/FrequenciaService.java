package service;

import model.Frequencia;

import java.util.ArrayList;
import java.util.List;

public class FrequenciaService {

    private static final List<Frequencia> frequencias = new ArrayList<>();

    // CREATE
    public void registrarFrequencia(Frequencia frequencia){
        Frequencia existente = buscarPorAlunoEDisciplina(frequencia.getAluno().getMatricula(), frequencia.getDisciplina().getNome());
        if(existente != null){
            System.out.println("Frequência já cadastrada.");
            return;
        }
        frequencias.add(frequencia);
    }

    // READ
    public List<Frequencia> listarFrequencias() {
        return frequencias;
    }

    // BUSCA
    public Frequencia buscarPorAlunoEDisciplina(String matriculaAluno, String nomeDisciplina) {
        for (Frequencia frequencia : frequencias) {
            if (frequencia.getAluno() != null && frequencia.getDisciplina() != null && frequencia.getAluno().getMatricula().equalsIgnoreCase(matriculaAluno) && frequencia.getDisciplina().getNome().equalsIgnoreCase(nomeDisciplina)) {
                return frequencia;
            }
        }
        return null;
    }

    // UPDATE
    public String lancarFaltas(String matriculaAluno, String nomeDisciplina, int quantidadeNovasFaltas) {
        if (quantidadeNovasFaltas <= 0) {
            return "Quantidade inválida!";
        }

        Frequencia frequencia = buscarPorAlunoEDisciplina(matriculaAluno, nomeDisciplina);

        if (frequencia != null) {
            frequencia.setFaltas(frequencia.getFaltas() + quantidadeNovasFaltas);
            return "Faltas atualizadas!";
        }
        return "Frequência não encontrada!";
    }

    // DELETE
    public String deletarFrequencia(String matriculaAluno, String nomeDisciplina) {
        for (int i = 0; i < frequencias.size(); i++) {
            Frequencia frequencia = frequencias.get(i);
            if (frequencia.getAluno() != null && frequencia.getDisciplina() != null && frequencia.getAluno().getMatricula().equalsIgnoreCase(matriculaAluno) && frequencia.getDisciplina().getNome().equalsIgnoreCase(nomeDisciplina)) {
                frequencias.remove(i);
                return "Frequência removida!";
            }
        }
        return "Frequência não encontrada!";
    }
}