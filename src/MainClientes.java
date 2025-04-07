import java.util.ArrayList;
import java.util.List;

public class MainClientes {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        
        clientes.add(new Cliente("João Silva", 25));
        clientes.add(new Cliente("Maria Santos", 30));
        clientes.add(new Cliente("Pedro Oliveira", 28));
        clientes.add(new Cliente("Ana Costa", 35));
        
        System.out.println("=== Lista de Clientes ===");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
} 