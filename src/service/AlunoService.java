package service;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno cadastrar (Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    public Aluno atualizar (Aluno aluno, int matricula) {
        for (Aluno a : alunos) {
            if(a.getMatricula() == matricula) {
                a.setNome(aluno.getNome());
                a.setEmail(aluno.getEmail());
                a.setIdade(aluno.getIdade());
                a.setEndereco(aluno.getEndereco());
                a.setTelefone(aluno.getTelefone());
                a.setAtivo(aluno.isAtivo());
                break;
            }
        }

        return aluno;
    }

    public List<Aluno> listar () {
        return alunos;
    }

    public void deletar (int matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                alunos.remove(a);
                break;
            }
        }
    }


}