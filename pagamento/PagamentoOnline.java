package pagamento;
class PagamentoOnline extends Pagamento {
    public PagamentoOnline(MetodoPagamento metodoPagamento) {
        super(metodoPagamento);
    }

    @Override
    void pagar(double valor) {
        System.out.println("[Pagamento Online]");
        metodoPagamento.processarPagamento(valor);
    }
}

class PagamentoPresencial extends Pagamento {
    public PagamentoPresencial(MetodoPagamento metodoPagamento) {
        super(metodoPagamento);
    }

    @Override
    void pagar(double valor) {
        System.out.println("[Pagamento Presencial]");
        metodoPagamento.processarPagamento(valor);
    }
}
