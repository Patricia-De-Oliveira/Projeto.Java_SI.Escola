import controller.*;
import enums.Cargo;
import model.*;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // INSTANCIANDO CONTROLLERS
        // ==============================

        ProfessorController professorController = new ProfessorController();

        DisciplinaController disciplinaController = new DisciplinaController();

        TurmaController turmaController = new TurmaController();

        AlunoController alunoController = new AlunoController();

        NotaController notaController = new NotaController();

        FrequenciaController frequenciaController = new FrequenciaController();

        LoginController loginController = new LoginController();

        // ==============================
        // CRIANDO PROFESSORES
        // ==============================

        Professor professor1 = new Professor(
                "Marcelo",
                40,
                "123456789",
                "P001",
                5000,
                Cargo.COORDENADOR
        );

        Professor professor2 = new Professor(
                "Fernanda",
                27,
                "987654321",
                "P002",
                6200,
                Cargo.PROFESSOR
        );

        // ==============================
        // CADASTRANDO PROFESSORES
        // ==============================

        professorController.cadastrarProfessor(professor1);
        professorController.cadastrarProfessor(professor2);

        // ==============================
        // CRIANDO DISCIPLINAS
        // ==============================

        Disciplina matematica = new Disciplina(
                "Matemática",
                80,
                professor1
        );

        Disciplina programacao = new Disciplina(
                "Programação",
                100,
                professor2
        );

        // ==============================
        // CADASTRANDO DISCIPLINAS
        // ==============================

        disciplinaController.cadastrarDisciplina(matematica);
        disciplinaController.cadastrarDisciplina(programacao);

        // ==============================
        // CRIANDO TURMA
        // ==============================

        Turma turmaSI = new Turma();
        turmaSI.setNome("SI-2026");

        // ==============================
        // ADICIONANDO DISCIPLINAS
        // ==============================

        turmaSI.adicionarDisciplina(matematica);
        turmaSI.adicionarDisciplina(programacao);

        // ==============================
        // CADASTRANDO TURMA
        // ==============================

        turmaController.cadastrarTurma(turmaSI);

        // ==============================
        // CRIANDO ALUNOS
        // ==============================

        Aluno aluno1 = new Aluno(
                "João",
                18,
                "111111111",
                turmaSI,
                "A001"
        );

        Aluno aluno2 = new Aluno(
                "Maria",
                20,
                "222222222",
                turmaSI,
                "A002"
        );

        // ==============================
        // ADICIONANDO ALUNOS NA TURMA
        // ==============================

        turmaSI.adicionarAluno(aluno1);
        turmaSI.adicionarAluno(aluno2);

        // ==============================
        // CADASTRANDO ALUNOS
        // ==============================

        alunoController.cadastrarAluno(aluno1);
        alunoController.cadastrarAluno(aluno2);

        // ==============================
        // CRIANDO NOTAS
        // ==============================

        Nota nota1 = new Nota(
                aluno1,
                matematica,
                8.5
        );

        Nota nota2 = new Nota(
                aluno2,
                programacao,
                9.0
        );

        // ==============================
        // CADASTRANDO NOTAS
        // ==============================

        notaController.cadastrarNota(nota1);
        notaController.cadastrarNota(nota2);

        // ==============================
        // CRIANDO FREQUÊNCIAS
        // ==============================

        Frequencia frequencia1 = new Frequencia(
                aluno1,
                matematica,
                3
        );

        Frequencia frequencia2 = new Frequencia(
                aluno2,
                programacao,
                1
        );

        // ==============================
        // REGISTRANDO FREQUÊNCIAS
        // ==============================

        frequenciaController.registrarFrequencia(frequencia1);
        frequenciaController.registrarFrequencia(frequencia2);

        // ==============================
        // CRIANDO USUÁRIOS
        // ==============================

        Usuario usuario1 = new Usuario(
                "joao",
                "123",
                Cargo.ALUNO,
                aluno1
        );

        Usuario usuario2 = new Usuario(
                "maria",
                "456",
                Cargo.ALUNO,
                aluno2
        );


        // ==============================
        // CADASTRANDO USUÁRIOS
        // ==============================

        loginController.cadastrarUsuario(usuario1);
        loginController.cadastrarUsuario(usuario2);

        // ==============================
        // TESTANDO LOGIN
        // ==============================

        Usuario usuarioTeste = new Usuario();
        usuarioTeste.setLogin("joao");
        usuarioTeste.setSenha("123");
        Usuario autenticado = loginController.autenticarUsuario(usuarioTeste.getLogin(), usuarioTeste.getSenha());

        // ==============================
        // VALIDANDO LOGIN
        // ==============================

        if (autenticado != null) {
            System.out.println("=================================");
            System.out.println("LOGIN REALIZADO COM SUCESSO!");
            System.out.println(autenticado);
        } else {
            System.out.println("Login inválido!");
        }

        // ==============================
        // LISTANDO PROFESSORES
        // ==============================

        System.out.println("\n========== PROFESSORES ==========");
        System.out.println(professorController.listarProfessores());

        // ==============================
        // LISTANDO DISCIPLINAS
        // ==============================

        System.out.println("\n========== DISCIPLINAS ==========");
        System.out.println(disciplinaController.listarDisciplinas());

        // ==============================
        // LISTANDO TURMAS
        // ==============================

        System.out.println("\n========== TURMAS ==========");
        System.out.println(turmaController.listarTurmas());

        // ==============================
        // LISTANDO ALUNOS
        // ==============================

        System.out.println("\n========== ALUNOS ==========");
        System.out.println(alunoController.listarAlunos());


        // ==============================
        // LISTANDO NOTAS
        // ==============================

        System.out.println("\n========== NOTAS ==========");
        System.out.println(notaController.listarNotas());

        // ==============================
        // LISTANDO FREQUÊNCIAS
        // ==============================

        System.out.println("\n========== FREQUÊNCIAS ==========");

        System.out.println(frequenciaController.listarFrequencias());

        // ==============================
        // TESTANDO UPDATE DE NOTA
        // ==============================

        System.out.println("\n========== ATUALIZANDO NOTA ==========");
        System.out.println(notaController.atualizarNota("A001", 10));

        // ==============================
        // LISTANDO NOTAS NOVAMENTE
        // ==============================

        System.out.println("\n========== NOTAS ATUALIZADAS ==========");
        System.out.println(notaController.listarNotas());

        // ==============================
        // TESTANDO DELETE DE NOTA
        // ==============================

        System.out.println("\n========== DELETANDO NOTA ==========");
        System.out.println(notaController.deletarNota("A002"));

        // ==============================
        // LISTANDO NOTAS APÓS DELETE
        // ==============================

        System.out.println("\n========== NOTAS FINAIS ==========");
        System.out.println(notaController.listarNotas());

        // ==============================
        // TESTANDO LANÇAMENTO DE FALTAS
        // ==============================

        System.out.println("\n========== LANÇANDO FALTAS ==========");
        System.out.println(frequenciaController.lancarFaltas("A001", "Matemática", 2));

        // ==============================
        // LISTANDO FREQUÊNCIAS FINAIS
        // ==============================

        System.out.println("\n========== FREQUÊNCIAS FINAIS ==========");
        System.out.println(frequenciaController.listarFrequencias());
    }
}