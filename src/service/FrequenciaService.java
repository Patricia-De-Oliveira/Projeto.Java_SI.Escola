package service;

import model.Frequencia;

import java.util.ArrayList;
import java.util.List;

public class FrequenciaService {
    private final List<Frequencia> frequencias = new ArrayList<>();

    public List<Frequencia> listarFrequencias() {
        return frequencias;
    }
    public void regristrarFrequencia(Frequencia frequencia) {
        frequencias.add(frequencia);
    }

    public Frequencia buscarPorAlunoEDisciplina(String matriculaAluno, String nomeDisciplina) {
        for (Frequencia f: frequencias) {
            if (f.getAluno() != null && f.getAluno().getMatricula().equals(matriculaAluno)&& f.getDisciplina() != null && f.getDisciplina() .getNome().equalsIgnoreCase(nomeDisciplina)) {
                return f;
            }
        }
        return null;
    }
    public String lancarFaltas (String matriculaAluno, String nomeDisciplina, int quantidadeNovasFaltas) {
        Frequencia freq = buscarPorAlunoEDisciplina(matriculaAluno, nomeDisciplina);

        if (freq != null) {
            int totalFaltasAtual = freq.getFaltas();
            freq.setFaltas(totalFaltasAtual + quantidadeNovasFaltas);
            return "Faltas atualizadas com sucesso!";
        }

        return "Registo de frequência não encontrado para este aluno nesta disciplina.";
    }
}
