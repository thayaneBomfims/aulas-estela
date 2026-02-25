public class Produto {
    // nome é do tipo caracter
    private String nome;
    // preço é do tipo numeros grandes decimal
    private double preco;

    // getter - busca algo
    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }

    //setter - setar/adicionar/modificar algo
    public void criarProduto(String nome, double preco){
        // é nesse momento que os dados de fora recebidos nos parâmetros estão sendo
        // preenchidos nos atributos da classe
        this.nome = nome;
        this.preco = preco;
    }
}
