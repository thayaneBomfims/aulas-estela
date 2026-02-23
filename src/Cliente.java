public class Cliente {

    private String nome;
    private int idade;

    //setter
    public void criarNomeCliente(String nome){
        this.nome = nome;
    }

    //getters
    public String pegarNomeCliente(){
        return this.nome;
    }

    public int getIdadeCliente(){
        return this.idade;
    }
}
