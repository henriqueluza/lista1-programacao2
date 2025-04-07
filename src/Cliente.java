public class Cliente {
    private static int proximoId = 1000;
    private int id;
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.id = proximoId++;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - Nome: " + nome + " - Idade: " + idade;
    }
} 