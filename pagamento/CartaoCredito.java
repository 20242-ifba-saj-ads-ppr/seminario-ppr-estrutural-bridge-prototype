package pagamento;
public class CartaoCredito implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Cartão de Crédito.");
    }
}
