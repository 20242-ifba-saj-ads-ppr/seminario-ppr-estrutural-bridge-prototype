package pagamento;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento pix = new Pix();
        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento boleto = new Boleto();

        Pagamento pagamento1 = new PagamentoOnline(pix);
        Pagamento pagamento2 = new PagamentoPresencial(cartao);
        Pagamento pagamento3 = new PagamentoOnline(boleto);

        pagamento1.pagar(150.00);
        pagamento2.pagar(200.50);
        pagamento3.pagar(300.75);
    }
}
