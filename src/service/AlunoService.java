package service;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AlunoService {
    private final List<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno (Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public String atualizarAluno (String matricula) {
        for (Aluno aluno : alunos) {
            if(Objects.equals(aluno.getMatricula(), matricula)) {
                aluno.setNome(aluno.getNome());
                aluno.setIdade(aluno.getIdade());
                return "Aluno alterado com sucesso!";
            }
        }

        return "Aluno não encontrado!";
    }

    public String deletarAluno (String matricula) {
        for (int i= 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equals(matricula)) {
                alunos.remove(i);
                return "Aluno deletado com sucesso!";
            }
        }
        return "Aluno não encontrado!";
    }


}