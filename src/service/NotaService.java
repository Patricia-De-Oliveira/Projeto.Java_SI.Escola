package service;

import java.util.ArrayList;
import java.util.List;
import model.Nota;

public class NotaService{
    private final List<Nota> notas = new ArrayList<>();

    //MétodoPOST - Cadastro
    public void cadastrarNota(Nota nota) {
        notas.add(nota);
    }
    //MétodoGet - Listar
    public List<Nota> listarNotas() {
        return notas;
    }
    //MétodoPUT - Atualizar
    public String atualizarNota(String matricula,double novoValor) {
        for(Nota nota : notas) {
            if(nota.getAluno().getMatricula().equalsIgnoreCase(matricula)){
                nota.setValor(novoValor);
                return "Nota alterada com sucesso!";
            }
        }
        return "Aluno não encontrado!";
    }
    //MétodoDELETE - Deletar
    public String deletarNota(String matricula) {
        for(int i = 0; i < notas.size(); i++) {
            if(notas.get(i).getAluno().getMatricula().equalsIgnoreCase(matricula)) {
                notas.remove(i);
                return "Nota deletada com sucesso!";
            }
        }
        return "Aluno não encontrado!";
    }
}