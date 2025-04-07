import java.util.Random;
import java.util.Scanner;

public class NumeroDaSorte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorte = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        
        System.out.println("Bem-vindo ao Jogo do Número da Sorte!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroSorte) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (palpite > numeroSorte) {
                System.out.println("Muito alto! Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou!");
                System.out.println("Número de tentativas: " + tentativas);
                break;
            }
        } while (true);
        
        scanner.close();
    }
} 