import java.util.ArrayList;
import java.util.List;

public class MainEstoque {
    public static void main(String[] args) {
        List<Produto> estoque = new ArrayList<>();
        
        estoque.add(new Produto("Notebook", 3));
        estoque.add(new Produto("Mouse", 10));
        estoque.add(new Produto("Teclado", 2));
        estoque.add(new Produto("Monitor", 8));
        estoque.add(new Produto("Impressora", 4));

        System.out.println("=== Alerta de Reposição ===");
        for (Produto produto : estoque) {
            if (produto.getQuantidade() < 5) {
                System.out.println("ALERTA: " + produto.getNome() + 
                                 " está com estoque baixo! Quantidade: " + 
                                 produto.getQuantidade());
            }
        }
    }
} 