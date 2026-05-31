package controller;
import model.Nota;
import service.NotaService;
import java.util.List;

public class NotaController {
    private final NotaService notaService = new NotaService();
    // Chamando metodo cadastrar
    public void cadastrarNota(Nota nota){
        notaService.cadastrarNota(nota);
    }
    // Chamando metodo listar
    public List<Nota> listarNotas(){
        return notaService.listarNotas();
    }
    // Chamando metodo atualizar
    public String atualizarNota(String matriculaAluno, String nomeDisciplina, double novoValor) {
        return notaService.atualizarNota(matriculaAluno, nomeDisciplina, novoValor);
    }
    // Chamando metodo deletar
    public String deletarNota(String matriculaAluno, String nomeDisciplina) {
        return notaService.deletarNota(matriculaAluno, nomeDisciplina);
    }
}