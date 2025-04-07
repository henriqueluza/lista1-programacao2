import java.util.Scanner;

public class SimuladorVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosA = 0;
        int votosB = 0;
        int votosC = 0;
        String voto;
        
        System.out.println("=== Simulador de Votação ===");
        System.out.println("Candidatos: A, B, C");
        System.out.println("Digite 'fim' para encerrar a votação");
        
        do {
            System.out.print("Digite seu voto (A, B ou C): ");
            voto = scanner.nextLine().toUpperCase();
            
            switch (voto) {
                case "A":
                    votosA++;
                    System.out.println("Voto registrado para o Candidato A");
                    break;
                case "B":
                    votosB++;
                    System.out.println("Voto registrado para o Candidato B");
                    break;
                case "C":
                    votosC++;
                    System.out.println("Voto registrado para o Candidato C");
                    break;
                case "FIM":
                    break;
                default:
                    System.out.println("Voto inválido! Tente novamente.");
            }
        } while (!voto.equals("FIM"));
        
        System.out.println("\n=== Resultados da Votação ===");
        System.out.println("Candidato A: " + votosA + " votos");
        System.out.println("Candidato B: " + votosB + " votos");
        System.out.println("Candidato C: " + votosC + " votos");
        
        String vencedor;
        int maiorVotos = Math.max(Math.max(votosA, votosB), votosC);
        
        if (maiorVotos == votosA) {
            vencedor = "A";
        } else if (maiorVotos == votosB) {
            vencedor = "B";
        } else {
            vencedor = "C";
        }
        
        System.out.println("\nVencedor: Candidato " + vencedor + " com " + maiorVotos + " votos!");
        
        scanner.close();
    }
} 