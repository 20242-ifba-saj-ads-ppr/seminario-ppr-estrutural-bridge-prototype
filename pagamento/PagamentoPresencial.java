package pagamento;
public class PagamentoPresencial extends Pagamento {

    public PagamentoPresencial(MetodoPagamento metodoPagamento) {
        super(metodoPagamento);
    }

    @Override
    public void pagar(double valor) {
        System.out.println("[Pagamento Presencial]");
        metodoPagamento.processarPagamento(valor);
    }
}
