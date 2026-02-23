import java.util.Scanner;

public class Main {

    static double totalGeral = 0;

    static double criarPedido(String produto, double preco, int quantidade) {

        double total = preco * quantidade;

        // desconto para compras acima de 1000
        if (total > 1000) {
            System.out.println("Desconto de 10% aplicado!");
            total = total * 0.9;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        Cliente cliente = new Cliente();

        cliente.criarNomeCliente(nome);

        System.out.println("Quantos pedidos deseja fazer?");
        int quantidadePedidos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantidadePedidos; i++) {

            System.out.println("\nPedido " + i);

            System.out.println("Nome do produto:");
            String produto = scanner.nextLine();

            System.out.println("Preço:");
            double preco = scanner.nextDouble();

            System.out.println("Quantidade:");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            double totalPedido = criarPedido(produto, preco, quantidade);

            totalGeral += totalPedido;

            System.out.println("Total do pedido: R$ " + totalPedido);
        }

        System.out.println("\n===== RESUMO =====");
        System.out.println("Cliente: " + cliente.pegarNomeCliente());
        System.out.println("Idade do cliente: " + cliente.getIdadeCliente());
        System.out.println("Total geral: R$ " + totalGeral);

        // bônus para quem gastou muito
        if (totalGeral > 5000) {
            System.out.println("Cliente VIP!");
        }

        scanner.close();
    }
}
