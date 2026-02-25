import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do cliente:");
        String idade = scanner.nextLine();

        Cliente cliente = new Cliente();

        cliente.criarNomeCliente(nome);
        cliente.criarIdadeCliente(Integer.parseInt(idade));

        System.out.println("Quantos produtos você quer cadastrar?:");
        int quantosProdutos = scanner.nextInt();
        scanner.nextLine();

        List<Produto> produtosFornecidos = new ArrayList<Produto>();

        for(int i = 0; i < quantosProdutos; i++){

            System.out.println("Digite o nome do produto:");
            String nomeProduto = scanner.nextLine();

            System.out.println("Digite o preço do produto:");
            double precoProduto = scanner.nextDouble();

            scanner.nextLine();
            Produto produto = new Produto();
            produto.criarProduto(nomeProduto, precoProduto);

            produtosFornecidos.add(produto);
        }


        System.out.println("\n===== RESUMO =====");
        System.out.println("Cliente: " + cliente.pegarNomeCliente());
        System.out.println("Idade do cliente: " + cliente.getIdadeCliente());
        System.out.println("PRODUTOS CADASTRADOS");
        System.out.println(produtosFornecidos);

        for(Produto produtoItem : produtosFornecidos){
            System.out.println("Nome do Produto:" + produtoItem.getNome() + " Preço:" + produtoItem.getPreco());
        }

        Pedido pedido = new Pedido();

        pedido.fazerPedido(produtosFornecidos);

        System.out.println("Total geral: R$ " + pedido.getPrecoFinal());

        // bônus para quem gastou muito
//        if (totalGeral > 5000) {
//            System.out.println("Cliente VIP!");
//        }

        scanner.close();
    }
}
