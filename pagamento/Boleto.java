package pagamento;
public class Boleto implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado para pagamento de R$" + valor);
    }
}
