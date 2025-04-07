public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario("João", 5000.0, "Gerente");
        Funcionario analista = new Funcionario("Maria", 3000.0, "Analista");
        Funcionario estagiario = new Funcionario("Pedro", 1500.0, "Estagiário");

        System.out.println("Bônus do " + gerente.getNome() + " (Gerente): R$ " + gerente.calcularBonus());
        System.out.println("Bônus do " + analista.getNome() + " (Analista): R$ " + analista.calcularBonus());
        System.out.println("Bônus do " + estagiario.getNome() + " (Estagiário): R$ " + estagiario.calcularBonus());
    }
} 