public class MainDisciplina {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Programação Java", "Segunda", "14:00");
        
        Aluno aluno1 = new Aluno("João Silva", "2024001");
        Aluno aluno2 = new Aluno("Maria Santos", "2024002");
        Aluno aluno3 = new Aluno("Pedro Oliveira", "2024003");

        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        disciplina.adicionarAluno(aluno3);

        disciplina.exibirAlunosMatriculados();
    }
} 