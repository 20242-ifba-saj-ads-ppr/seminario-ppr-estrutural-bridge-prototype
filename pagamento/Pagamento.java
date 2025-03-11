package pagamento;
abstract class Pagamento {
    protected MetodoPagamento metodoPagamento;

    public Pagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    abstract void pagar(double valor);
}
