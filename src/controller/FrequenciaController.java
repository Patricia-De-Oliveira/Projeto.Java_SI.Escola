package controller;

import model.Frequencia;
import service.FrequenciaService;

import java.util.List;

public class FrequenciaController {

    private final FrequenciaService frequenciaService =new FrequenciaService();

    // CREATE
    public void registrarFrequencia(Frequencia frequencia){
        frequenciaService.registrarFrequencia(frequencia);
    }

    // READ
    public List<Frequencia> listarFrequencias(){
        return frequenciaService.listarFrequencias();
    }

    // UPDATE
    public String lancarFaltas(String matriculaAluno, String nomeDisciplina, int quantidadeNovasFaltas){
        return frequenciaService.lancarFaltas(matriculaAluno, nomeDisciplina, quantidadeNovasFaltas);
    }

    // DELETE
    public String deletarFrequencia(String matriculaAluno, String nomeDisciplina){
        return frequenciaService.deletarFrequencia(matriculaAluno, nomeDisciplina);
    }
}