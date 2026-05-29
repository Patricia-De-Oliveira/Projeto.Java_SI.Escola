package service;

import model.Frequencia;

import java.util.ArrayList;
import java.util.List;

public class FrequenciaService {

    private final List<Frequencia> frequencias = new ArrayList<>();

    // CREATE
    public void registrarFrequencia(Frequencia frequencia){
        frequencias.add(frequencia);
    }

    // READ
    public List<Frequencia> listarFrequencias(){
        return frequencias;
    }

    // BUSCA ESPECÍFICA
    public Frequencia buscarPorAlunoEDisciplina(String matriculaAluno, String nomeDisciplina){
        for(Frequencia f : frequencias){
            if(f.getAluno() != null && f.getAluno().getMatricula().equalsIgnoreCase(matriculaAluno) && f.getDisciplina() != null && f.getDisciplina().getNome().equalsIgnoreCase(nomeDisciplina)){
                return f;
            }
        }
        return null;
    }

    // UPDATE
    public String lancarFaltas(String matriculaAluno,String nomeDisciplina,int quantidadeNovasFaltas){
        if(quantidadeNovasFaltas <= 0){
            return "Quantidade inválida!";
        }
        Frequencia frequencia = buscarPorAlunoEDisciplina(matriculaAluno,nomeDisciplina);
        if(frequencia != null){
            int totalAtual = frequencia.getFaltas();
            frequencia.setFaltas(totalAtual + quantidadeNovasFaltas);
            return "Faltas atualizadas!";
        }
        return "Frequência não encontrada!";
    }
}