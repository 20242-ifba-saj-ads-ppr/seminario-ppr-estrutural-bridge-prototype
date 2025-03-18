package pagamento;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento pix = new Pix();
        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento boleto = new Boleto();

        Pagamento pagamento1 = new PagamentoOnline(pix);
        Pagamento pagamento2 = new PagamentoPresencial(cartao);
        Pagamento pagamento3 = new PagamentoOnline(boleto);
        Pagamento pagamento4 = new PagamentoPresencial(boleto);
        Pagamento pagamento5 = new PagamentoPresencial(pix);



        pagamento1.pagar(150.00);
        pagamento2.pagar(200.50);
        pagamento3.pagar(300.75);
        pagamento4.pagar(400.00);
        pagamento5.pagar(500.00);
    }
}
