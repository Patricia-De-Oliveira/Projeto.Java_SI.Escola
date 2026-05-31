package service;

import java.util.ArrayList;
import java.util.List;
import model.Nota;

public class NotaService{
    private static final List<Nota> notas = new ArrayList<>();

    //MétodoPOST - Cadastro
    public void cadastrarNota(Nota nota) {
        Nota existente = buscarNota(nota.getAluno().getMatricula(), nota.getDisciplina().getNome());
        if (existente != null) {
            System.out.println("Já existe nota para este aluno nesta disciplina.");
            return;
        }
        notas.add(nota);
    }
    //MétodoGet - Listar
    public List<Nota> listarNotas() {
        return notas;
    }
    //MétodoPUT - Atualizar
    public String atualizarNota(String matriculaAluno, String nomeDisciplina, double novoValor) {
        Nota nota = buscarNota(matriculaAluno, nomeDisciplina);
        if (nota != null) {
            nota.setValor(novoValor);
            return "Nota alterada com sucesso!";
        }
        return "Nota não encontrada.";
    }
    //MétodoDELETE - Deletar
    public String deletarNota(String matriculaAluno, String nomeDisciplina) {

        for (int i = 0; i < notas.size(); i++) {
            Nota nota = notas.get(i);
            if (nota.getAluno() != null && nota.getDisciplina() != null && nota.getAluno().getMatricula().equalsIgnoreCase(matriculaAluno) && nota.getDisciplina().getNome().equalsIgnoreCase(nomeDisciplina)) {
                notas.remove(i);
                return "Nota deletada com sucesso!";
            }
        }
        return "Nota não encontrada!";
    }
    public Nota buscarNota(String matriculaAluno, String nomeDisciplina) {
        for (Nota nota : notas) {
            if (nota.getAluno() != null && nota.getDisciplina() != null && nota.getAluno().getMatricula().equalsIgnoreCase(matriculaAluno) && nota.getDisciplina().getNome().equalsIgnoreCase(nomeDisciplina)) {
                return nota;
            }
        }
        return null;
    }
}