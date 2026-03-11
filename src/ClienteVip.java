// Herança - recebi tudo que meu pai tem
public class ClienteVip extends Cliente {
    private double desconto = 0.8;

    //Polimorfismo - alterei algo que meu pai tem
    @Override
    public double aplicarDesconto(double valorDaCompra) {
        return valorDaCompra * desconto;
    }
}
