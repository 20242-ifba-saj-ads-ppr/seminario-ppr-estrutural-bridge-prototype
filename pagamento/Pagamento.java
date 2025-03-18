package pagamento;
public abstract class Pagamento {
    protected MetodoPagamento metodoPagamento;

    public Pagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public abstract void pagar(double valor);
}
