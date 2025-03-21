package pagamento;
public class PagamentoOnline extends Pagamento {

    public PagamentoOnline(MetodoPagamento metodoPagamento) {
        super(metodoPagamento);
    }

    @Override
    public void pagar(double valor) {
        System.out.println("[Pagamento Online]");
        metodoPagamento.processarPagamento(valor);
    }
}
