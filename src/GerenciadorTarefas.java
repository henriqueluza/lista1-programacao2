import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\n=== Gerenciador de Tarefas ===");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                    
                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover!");
                    } else {
                        System.out.println("\nTarefas disponíveis:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa para remover: ");
                        int indice = scanner.nextInt() - 1;
                        
                        if (indice >= 0 && indice < tarefas.size()) {
                            tarefas.remove(indice);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;
                    
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas cadastradas!");
                    } else {
                        System.out.println("\n=== Lista de Tarefas ===");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Programa encerrado!");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
} 