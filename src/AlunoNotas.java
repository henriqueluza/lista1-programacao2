public class AlunoNotas {
    private String nome;
    private double[] notas;

    public AlunoNotas(String nome) {
        this.nome = nome;
        this.notas = new double[4];
    }

    public void setNota(int posicao, double nota) {
        if (posicao >= 0 && posicao < 4) {
            notas[posicao] = nota;
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String verificarStatus() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            sb.append(notas[i]);
            if (i < notas.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("\nMédia: ").append(calcularMedia());
        sb.append("\nStatus: ").append(verificarStatus());
        return sb.toString();
    }
} 