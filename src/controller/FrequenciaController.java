package controller;

import model.Frequencia;
import service.FrequenciaService;

import java.util.List;

public class FrequenciaController {
    private final FrequenciaService frequenciaService = new FrequenciaService();

    public void registrarFrequencia(Frequencia frequencia) {
        frequenciaService.regristrarFrequencia(frequencia);
    }

    public List<Frequencia> ListarFrequencias() {
        return frequenciaService.listarFrequencias();
    }

    public String lancarFaltas (String matriculaAluno, String nomeDisciplina, int quantidadeNovasFaltas) {
        return frequenciaService.lancarFaltas(matriculaAluno, nomeDisciplina, quantidadeNovasFaltas);
    }
}
