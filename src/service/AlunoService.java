package service;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private final ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno cadastrar (Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    public List<Aluno> listar() {
        return alunos;
    }

    public Aluno atualizar(Aluno aluno, String matricula) {
        for (Aluno a : alunos) {
            if(a.getMatricula().equalsIgnoreCase(matricula)) {
                a.setNome(aluno.getNome());
                a.setIdade(aluno.getIdade());
                break;
            }
        }

        return aluno;
    }



    public void deletar(String matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equalsIgnoreCase(matricula)) {
                alunos.remove(a);
                break;
            }
        }
    }


}