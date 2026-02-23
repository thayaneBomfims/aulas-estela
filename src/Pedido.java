import java.util.List;

public class Pedido {
    // produto é do tipo Produto (nome, preco)
    private List<Produto> produto;

    // EXEMPLO DE LISTA DE PRODUTOS
//    [
//        {
//            "nome": "Escova de dente",
//                "preco": 10
//        },
//        {
//            "nome": "Creme dental",
//                "preco": 30
//        }
//    ]

    private int quantidade;
    private double precoFinal;

    public void fazerPedido(List<Produto> produtos) {

        this.quantidade = produtos.size();



    }
}
