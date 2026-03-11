public class Cliente {

    private String nome;
    private int idade;

    //setter
    public void criarNomeCliente(String nome){
        this.nome = nome;
    }

    public void criarIdadeCliente(int idade){
        this.idade = idade;
    }

    //getters
    public String pegarNomeCliente(){
        return this.nome;
    }

    public int getIdadeCliente(){
        return this.idade;
    }

    public double aplicarDesconto(double valorDaCompra) {
        return valorDaCompra;
    }
}
