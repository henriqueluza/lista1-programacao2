import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "123456";
        int tentativas = 0;
        int maxTentativas = 3;
        
        System.out.println("=== Sistema de Login ===");
        
        while (tentativas < maxTentativas) {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();
            
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativas++;
                if (tentativas < maxTentativas) {
                    System.out.println("Usuário ou senha incorretos! Tentativas restantes: " + 
                                     (maxTentativas - tentativas));
                } else {
                    System.out.println("Conta bloqueada!");
                }
            }
        }
        
        scanner.close();
    }
} 