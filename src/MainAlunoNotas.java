public class MainAlunoNotas {
    public static void main(String[] args) {
        AlunoNotas aluno1 = new AlunoNotas("João Silva");
        aluno1.setNota(0, 8.5);
        aluno1.setNota(1, 7.0);
        aluno1.setNota(2, 9.0);
        aluno1.setNota(3, 8.0);

        AlunoNotas aluno2 = new AlunoNotas("Maria Santos");
        aluno2.setNota(0, 6.0);
        aluno2.setNota(1, 5.5);
        aluno2.setNota(2, 6.5);
        aluno2.setNota(3, 5.0);

        AlunoNotas aluno3 = new AlunoNotas("Pedro Oliveira");
        aluno3.setNota(0, 4.0);
        aluno3.setNota(1, 3.5);
        aluno3.setNota(2, 4.5);
        aluno3.setNota(3, 3.0);

        System.out.println("=== Resultados dos Alunos ===\n");
        System.out.println(aluno1);
        System.out.println("\n-------------------\n");
        System.out.println(aluno2);
        System.out.println("\n-------------------\n");
        System.out.println(aluno3);
    }
} 