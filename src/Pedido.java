import java.util.List;

public class Pedido {
    // produto é do tipo Produto (nome, preco)
    // as boquinhas <> servem para tipar - dizer qual o tipo dos dados que vão estar nesta lista
    private List<Produto> produtos;

    // EXEMPLO DE LISTA DE PRODUTOS (classe que gera objetos)
//    [
//        {
//            nome: "Escova de dente",
//            preco: 10
//        },
//        {
//            nome: "Creme dental",
//            preco: 30
//        },
//    ]

    private int quantidade;
    private double precoFinal;

    public double getPrecoFinal() {
        return this.precoFinal;
    }

    private double calcularPrecoFinal (List<Produto> produtosParaCalcular) {
        double total = 0;

        for(Produto produtoItem : produtosParaCalcular){

            total = total + produtoItem.getPreco();

        }

        return total;
    }

    public void fazerPedido(List<Produto> produtosParaPedido) {

        this.produtos = produtosParaPedido;

        this.quantidade = produtos.size();

        this.precoFinal = calcularPrecoFinal(produtosParaPedido);

        if (this.precoFinal > 100) {
            System.out.println("Desconto de 10% aplicado!");
            this.precoFinal = this.precoFinal * 0.9;
        }

    }

}
