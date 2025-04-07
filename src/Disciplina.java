public class Disciplina {
    private String nome;
    private String dia;
    private String horario;
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Disciplina(String nome, String dia, String horario) {
        this.nome = nome;
        this.dia = dia;
        this.horario = horario;
        this.alunos = new Aluno[50];
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            System.out.println("Aluno adicionado com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais alunos. Turma cheia!");
        }
    }

    public void exibirAlunosMatriculados() {
        System.out.println("\nAlunos matriculados em " + nome + ":");
        System.out.println("Dia: " + dia + " - Horário: " + horario);
        System.out.println("----------------------------------------");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println(alunos[i]);
        }
        System.out.println("----------------------------------------");
    }
} 