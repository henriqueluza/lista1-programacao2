public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularBonus() {
        switch (cargo.toLowerCase()) {
            case "gerente":
                return salario * 0.20;
            case "analista":
                return salario * 0.10;
            case "estagiário":
                return salario * 0.05;
            default:
                return 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
} 